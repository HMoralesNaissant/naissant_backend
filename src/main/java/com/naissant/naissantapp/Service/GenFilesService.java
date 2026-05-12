/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 * */

package com.naissant.naissantapp.Service;

import com.naissant.naissantapp.Constants.GenFilesTypes;
import com.naissant.naissantapp.Entity.GenFiles;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface GenFilesService {

    List<GenFiles> listar();

    GenFiles listarId(int id);

    GenFiles add(GenFiles f);

    GenFiles edit(GenFiles f);

    GenFiles delete(int id);

    List<GenFiles> listarByNameFile(String name_file);

    public GenFiles saveFile(String subFolderPaths, MultipartFile file,
            String description, GenFilesTypes fileType) throws IOException;

    public Resource load(String filename);

    public Resource downloadFile(String fileId);

    public Stream<Path> loadAll();

    public String deleteServerFile(String filename) throws IOException;
    
    public void deleteFileById(Integer fileId);
}
