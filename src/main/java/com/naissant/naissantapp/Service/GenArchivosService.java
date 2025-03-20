/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 * */
package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Constants.GenArchivosTypes;
import com.naissant.naissantapp.Entity.GenArchivos;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface GenArchivosService {

    List<GenArchivos> listar();

    GenArchivos listarId(int id);

    GenArchivos add(GenArchivos f);

    GenArchivos edit(GenArchivos f);

    GenArchivos delete(int id);

    List<GenArchivos> listarByNombreArchivo(String nombre_archivo);

    public GenArchivos saveFile(String subFolderPaths, MultipartFile file,
            String descripcion, GenArchivosTypes fileType) throws IOException;

    public Resource load(String filename);

    public Resource downloadFile(String fileId);

    public Stream<Path> loadAll();

    public String deleteServerFile(String filename) throws IOException;
    
    public void deleteFileById(Integer fileId);
}
