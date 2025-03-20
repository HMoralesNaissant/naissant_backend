/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 * */
package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Constants.GenArchivosTypes;
import com.naissant.naissantapp.Entity.GenArchivos;
import com.naissant.naissantapp.Repository.UsuariosRepositorio;
import com.naissant.naissantapp.Entity.Usuarios;
import com.naissant.naissantapp.Repository.GenArchivosRepository;
import com.naissant.naissantapp.Service.GenArchivosService;
import com.naissant.naissantapp.Service.UsuariosService;
import java.util.List;
import com.naissant.naissantapp.message.ProyectosFile;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UsuariosServiceImp implements UsuariosService {

    private UsuariosRepositorio repositorio;
    private final GenArchivosRepository fileRepositorio;
    private final GenArchivosService filesService;
    private final String filesPath;

    @Autowired
    public UsuariosServiceImp(
            UsuariosRepositorio repositorio,
            GenArchivosRepository fileRepositorio,
            GenArchivosService filesService,
            @Value("${filesdir.profile_photos}") String filesPath) {
        this.repositorio = repositorio;
        this.fileRepositorio = fileRepositorio;
        this.filesService = filesService;
        this.filesPath = filesPath;
    }

    @Override
    public List<Usuarios> listar() {
        return repositorio.findAll();
    }

    @Override
    public Usuarios listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Usuarios add(Usuarios u) {
        return repositorio.save(u);
    }

    @Override
    public Usuarios edit(Usuarios u) {
        return repositorio.save(u);
    }

    @Override
    public List<Usuarios> listarByIdPersona(int id_persona) {
        return repositorio.findByPersonaId_Id(id_persona);
    }

    @Override
    public List<Usuarios> listarByUsuario(String usuario) {
        return repositorio.findByUsuario(usuario);
    }

    @Override
    public Usuarios delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProyectosFile saveFotoPerfil(Integer usuarioId,
            MultipartFile[] files, String descripcion) throws IOException {

        Usuarios usuario = repositorio.findById(usuarioId).get();
        MultipartFile[] file = files;

        if (file != null) {
            if (!Objects.isNull(usuario.getFotoArchivoId())) {
                GenArchivos oldPhoto = filesService.listarId(usuario.getFotoArchivoId());
                filesService.deleteFileById(oldPhoto.getId());
                usuario.setFotoArchivoId(null);
            }
            String finalPath = Paths.get(filesPath, "" + usuarioId).toString();
            GenArchivos fotoPerfil = filesService.saveFile(finalPath, file[0], descripcion, GenArchivosTypes.IMAGE);
            usuario.setFotoArchivoId(fotoPerfil.getId());
            edit(usuario);
        }
        return new ProyectosFile("Se subieron los archivos correctamente ");
    }

    @Override
    public Resource downloadProfilePicture(Integer userId) {
        Usuarios user = repositorio.getById(userId);
        if (user != null && user.getFotoArchivoId() != null) {
            return filesService.downloadFile(user.getFotoArchivoId().toString());
        }
        return null;
    }
}
