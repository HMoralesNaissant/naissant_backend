/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.GenFiles;
import com.naissant.naissantapp.Entity.Products;
import com.naissant.naissantapp.message.ProyectsFile;
import java.io.IOException;
import java.util.List;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;


public interface ProductsService {
    List<Products>listar();
    Products listarId(int id);
    Products add(Products p);
    Products edit(Products p);
    Products delete(int id);
    
    List<Products>listarByIdCatProducts(int id_cat_products);
    List<Products>listarByIdPresentation(int id_presentation);
    /*List<Products>listarByBarCode(String bar_code);*/
    
    public ProyectsFile savePhotoProfile(Integer productId, MultipartFile[] files, String description) throws IOException;
    public List<GenFiles> listarByNameFile(String name_file);
    public Resource downloadProfilePicture(Integer productId);
}
