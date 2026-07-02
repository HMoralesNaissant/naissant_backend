/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 * */

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Constants.GenFilesTypes;
import com.naissant.naissantapp.Entity.GenFiles;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import com.naissant.naissantapp.Repository.GenFilesRepository;
import com.naissant.naissantapp.Service.GenFilesService;

@Service
public class GenFilesServiceImp implements GenFilesService {

    private final Logger LOG = LoggerFactory.getLogger(GenFilesServiceImp.class);
    private GenFilesRepository repository;
    private final Path root;

    @Autowired
    public GenFilesServiceImp(
            GenFilesRepository repository,
            @Value("${filesdir.root}") String filesRootPath
    ) {
        root = Paths.get(filesRootPath);
        this.repository = repository;
    }

    @Override
    public List<GenFiles> listar() {
        return repository.findAll();
    }

    @Override
    public GenFiles listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public GenFiles add(GenFiles f) {
        return repository.save(f);
    }

    @Override
    public GenFiles edit(GenFiles f) {
        return repository.save(f);
    }

    @Override
    public List<GenFiles> listarByNameFile(String name_file) {
        return repository.findByNameFile(name_file);
    }

    @Override
    public GenFiles delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GenFiles saveFile(String subfolderPath,
            MultipartFile file, String description,
            GenFilesTypes fileType) throws IOException {
        //copy (que queremos copiar, a donde queremos copiar)
        String fileName = fixFilesName(file.getOriginalFilename());
        Long size = file.getSize();
        String format = file.getContentType();

        Path currentPath = this.root.resolve(subfolderPath);
        if (!Files.exists(currentPath)) {
            Files.createDirectories(currentPath);
        }
        Path newFilePath = this.root.resolve(Paths.get(subfolderPath, fileName));
        Files.copy(file.getInputStream(), newFilePath);

        GenFiles files = new GenFiles();
        files.setNameFile(fileName);
        files.setSize(Double.valueOf(size));
        files.setTypeFile(format);
        files.setUrl(newFilePath.toString());
        files.setDescription(description);
        files.setUser_create("ADMIN");
        files.setFileType(fileType);
        files.setDate_create(new Date());
        files.setUser_update("ADMIN");
        files.setDate_update(new Date());

        return repository.save(files);

    }

    @Override
    public Resource load(String filename) {
        try {
            Path file = root.resolve(filename);
            Resource resource = new UrlResource(file.toUri());

            if (resource.exists() || resource.isReadable()) {
                return resource;
            } else {
                throw new RuntimeException("No se puede leer el archivo ");
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException("Error: " + e.getMessage());
        }
    }

    @Override
    public Stream<Path> loadAll() {
        //Files.walk recorre nuestras carpetas (uploads) buscando los archivos
        // el 1 es la profundidad o nivel que queremos recorrer
        // :: Referencias a metodos
        // Relativize sirve para crear una ruta relativa entre la ruta dada y esta ruta
        try {
            return Files.walk(this.root, 1).filter(path -> !path.equals(this.root))
                    .map(this.root::relativize);
        } catch (RuntimeException | IOException e) {
            throw new RuntimeException("No se pueden cargar los archivos ");
        }
    }

    @Override
    public String deleteServerFile(String fileUrl) throws IOException {
        Files.deleteIfExists(Paths.get(fileUrl));
        return "Borrado";
    }

    @Override
    public Resource downloadFile(String fileId) {

        GenFiles fileRecord = repository.getOne(Integer.parseInt(fileId));
        if (fileRecord == null || StringUtils.isEmpty(fileRecord.getUrl())) {
            throw new RuntimeException("No se puede leer el archivo ");
        }

        Path file = root.resolve(fileRecord.getUrl());
        Resource resource;
        try {
            resource = new UrlResource(file.toUri());
        } catch (MalformedURLException ex) {
            throw new RuntimeException("No se puede leer el archivo ");
        }
        if (resource.exists() && resource.isReadable()) {
            return resource;
        } else {
            throw new RuntimeException("No se puede leer el archivo ");
        }
    }

    private String fixFilesName(String originalFilename) {
        return originalFilename.replace("jfif", "jpg");
    }

    @Override
    public void deleteFileById(Integer fileId) {
        GenFiles file = repository.getById(fileId);
        if (file != null) {
            repository.delete(file);
            try {
                deleteServerFile(file.getUrl());
            } catch (IOException e) {
                LOG.error("No se pudo eliminar el archivo del servidor " + e);
            }
        }
    }
}
