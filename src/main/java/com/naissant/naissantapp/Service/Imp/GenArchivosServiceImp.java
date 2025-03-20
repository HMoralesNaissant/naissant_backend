/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 * */
package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Constants.GenArchivosTypes;
import com.naissant.naissantapp.Entity.GenArchivos;
import com.naissant.naissantapp.Repository.GenArchivosRepository;
import com.naissant.naissantapp.Service.GenArchivosService;
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

@Service
public class GenArchivosServiceImp implements GenArchivosService {

    private final Logger LOG = LoggerFactory.getLogger(GenArchivosServiceImp.class);
    private GenArchivosRepository repositorio;
    private final Path root;

    @Autowired
    public GenArchivosServiceImp(
            GenArchivosRepository repositorio,
            @Value("${filesdir.root}") String filesRootPath
    ) {
        root = Paths.get(filesRootPath);
        this.repositorio = repositorio;
    }

    @Override
    public List<GenArchivos> listar() {
        return repositorio.findAll();
    }

    @Override
    public GenArchivos listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public GenArchivos add(GenArchivos f) {
        return repositorio.save(f);
    }

    @Override
    public GenArchivos edit(GenArchivos f) {
        return repositorio.save(f);
    }

    @Override
    public List<GenArchivos> listarByNombreArchivo(String nombre_archivo) {
        return repositorio.findByNombreArchivo(nombre_archivo);
    }

    @Override
    public GenArchivos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GenArchivos saveFile(String subfolderPath,
            MultipartFile file, String descripcion,
            GenArchivosTypes fileType) throws IOException {
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

        GenArchivos archivo = new GenArchivos();
        archivo.setNombreArchivo(fileName);
        archivo.setTamano(Double.valueOf(size));
        archivo.setTipoArchivo(format);
        archivo.setUrl(newFilePath.toString());
        archivo.setDescripcion(descripcion);
        archivo.setUser_create("ADMIN");
        archivo.setFileType(fileType);
        archivo.setDate_create(new Date());
        archivo.setUser_update("ADMIN");
        archivo.setDate_update(new Date());

        return repositorio.save(archivo);

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

        GenArchivos fileRecord = repositorio.getOne(Integer.parseInt(fileId));
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
        GenArchivos file = repositorio.getById(fileId);
        if (file != null) {
            repositorio.delete(file);
            try {
                deleteServerFile(file.getUrl());
            } catch (IOException e) {
                LOG.error("No se pudo eliminar el archivo del servidor " + e);
            }
        }
    }
}
