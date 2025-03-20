/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 * */
package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Entity.Usuarios;
import java.util.List;
import com.naissant.naissantapp.message.ProyectosFile;
import java.io.IOException;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface UsuariosService {

    List<Usuarios> listar();

    Usuarios listarId(int id);

    Usuarios add(Usuarios u);

    Usuarios edit(Usuarios u);

    Usuarios delete(int id);

    List<Usuarios> listarByIdPersona(int id_persona);

    List<Usuarios> listarByUsuario(String usuario);

    public ProyectosFile saveFotoPerfil(Integer usuarioId, MultipartFile[] files, String descripcion) throws IOException;

    public Resource downloadProfilePicture(Integer userId);
}
