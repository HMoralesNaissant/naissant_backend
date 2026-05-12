/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Constants.GenFilesTypes;
import com.naissant.naissantapp.Entity.GenFiles;
import com.naissant.naissantapp.Entity.Users;
import java.util.List;
import com.naissant.naissantapp.message.ProyectsFile;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.naissant.naissantapp.Repository.GenFilesRepository;
import com.naissant.naissantapp.Service.GenFilesService;
import com.naissant.naissantapp.Repository.UsersRepository;
import com.naissant.naissantapp.Service.UsersService;

@Service
public class UsersServiceImp implements UsersService {

    private UsersRepository repository;
    private final GenFilesRepository fileRepository;
    private final GenFilesService filesService;
    private final String filesPath;

    @Autowired
    public UsersServiceImp(
            UsersRepository repository,
            GenFilesRepository fileRepository,
            GenFilesService filesService,
            @Value("${filesdir.profile_photos}") String filesPath) {
        this.repository = repository;
        this.fileRepository = fileRepository;
        this.filesService = filesService;
        this.filesPath = filesPath;
    }

    @Override
    public List<Users> listar() {
        return repository.findAll();
    }

    @Override
    public Users listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Users add(Users u) {
        return repository.save(u);
    }

    @Override
    public Users edit(Users u) {
        return repository.save(u);
    }

    @Override
    public List<Users> listarByIdPerson(int id_person) {
        return repository.findByPersonId_Id(id_person);
    }

    @Override
    public List<Users> listarByUser(String user) {
        return repository.findByUser(user);
    }

    @Override
    public Users delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProyectsFile savePhotoProfile(Integer userId,
            MultipartFile[] files, String description) throws IOException {

        Users user = repository.findById(userId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(user.getPhotoFileId())) {
                GenFiles oldPhoto = filesService.listarId(user.getPhotoFileId());
                filesService.deleteFileById(oldPhoto.getId());
                user.setPhotoFileId(null);
            }
            String finalPath = Paths.get(filesPath, "" + userId).toString();
            GenFiles photoProfile = filesService.saveFile(finalPath, file[0], description, GenFilesTypes.IMAGE);
            user.setPhotoFileId(photoProfile.getId());
            edit(user);
        }
        return new ProyectsFile("Se subieron los archivos correctamente ");
    }

    @Override
    public Resource downloadProfilePicture(Integer userId) {
        Users user = repository.getById(userId);
        if (user != null && user.getPhotoFileId() != null) {
            return filesService.downloadFile(user.getPhotoFileId().toString());
        }
        return null;
    }
}
