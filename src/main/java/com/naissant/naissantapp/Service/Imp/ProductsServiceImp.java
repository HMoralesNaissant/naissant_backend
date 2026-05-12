/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Constants.GenFilesTypes;
import com.naissant.naissantapp.Entity.GenFiles;
import com.naissant.naissantapp.Entity.Products;
import com.naissant.naissantapp.Service.ProductsService;
import com.naissant.naissantapp.Repository.ProductsRepository;
import java.util.List;
import java.nio.file.Paths;
import com.naissant.naissantapp.message.ProyectsFile;
import java.io.IOException;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;
import com.naissant.naissantapp.Repository.GenFilesRepository;
import com.naissant.naissantapp.Service.GenFilesService;


@Service
public class ProductsServiceImp implements ProductsService{
    
    private ProductsRepository repository;
    private final GenFilesRepository fileRepository;
    private final GenFilesService filesService;
    private final String filesPath;
    
    @Autowired
    public ProductsServiceImp(
            ProductsRepository repository,
            GenFilesRepository fileRepository,
            GenFilesService filesService,
            @Value("${filesdir.product_photos}") String filesPath) {
        this.repository = repository;
        this.fileRepository = fileRepository;
        this.filesService = filesService;
        this.filesPath = filesPath;
    }
    
    
    @Override
    public List<Products> listar() {
        return repository.findAll();
    }

    @Override
    public Products listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Products add(Products p) {
        return repository.save(p);
    }

    @Override
    public Products edit(Products p) {
        return repository.save(p);
    }
    
    @Override
    public List<Products> listarByIdCatProducts(int id_cat_products) {
        return repository.findByCatProductsId_Id(id_cat_products);
    }
    
    @Override
    public List<Products> listarByIdPresentation(int id_presentation) {
        return repository.findByPresentationId_Id(id_presentation);
    }
    
    /*@Override
    public List<Products> listarByBarCode(String bar_code) {
        return repository.findByBarCode(bar_code);
    }*/

    @Override
    public Products delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ProyectsFile savePhotoProfile(Integer productId,
            MultipartFile[] files, String description) throws IOException {

        Products product = repository.findById(productId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(product.getFileId())) {
                GenFiles oldPhoto = filesService.listarId(product.getFileId());
                filesService.deleteFileById(oldPhoto.getId());
                product.setFileId(null);
            }
            String finalPath = Paths.get(filesPath, "" + productId).toString();
            GenFiles photoProfile = filesService.saveFile(finalPath, file[0], description, GenFilesTypes.IMAGE);
            product.setFileId(photoProfile.getId());
            edit(product);
        }
        return new ProyectsFile("Se subieron los archivos correctamente ");
    }
    
    @Override
    public List<GenFiles> listarByNameFile(String name_file) {
        return filesService.listarByNameFile(name_file);
    }

    @Override
    public Resource downloadProfilePicture(Integer productId) {
        Products product = repository.getById(productId);
        if (product != null && product.getFileId() != null) {
            return filesService.downloadFile(product.getFileId().toString());
        }
        return null;
    }
}
