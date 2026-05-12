/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Users;
import java.util.List;
import com.naissant.naissantapp.message.ProyectsFile;
import java.io.IOException;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface UsersService {

    List<Users> listar();
    Users listarId(int id);
    Users add(Users u);
    Users edit(Users u);
    Users delete(int id);

    List<Users> listarByIdPerson(int id_person);
    List<Users> listarByUser(String user);

    public ProyectsFile savePhotoProfile(Integer userId, MultipartFile[] files, String description) throws IOException;
    public Resource downloadProfilePicture(Integer userId);
}
