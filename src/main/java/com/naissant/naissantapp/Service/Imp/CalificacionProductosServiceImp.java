/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Repository.CalificacionProductosRepositorio;
import com.naissant.naissantapp.Entity.CalificacionProductos;
import com.naissant.naissantapp.Repository.GenArchivosRepository;
import com.naissant.naissantapp.Service.CalificacionProductosService;
import com.naissant.naissantapp.Service.GenArchivosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class CalificacionProductosServiceImp implements CalificacionProductosService{
    
    private CalificacionProductosRepositorio repositorio;
    private final GenArchivosRepository fileRepositorio;
    private final GenArchivosService archivosService;
    private final String filesPath;
    
    @Autowired
    public CalificacionProductosServiceImp(
            CalificacionProductosRepositorio repositorio,
            GenArchivosRepository fileRepositorio,
            GenArchivosService archivosService,
            @Value("${filesdir.root}") String filesPath) {
        this.repositorio = repositorio;
        this.fileRepositorio = fileRepositorio;
        this.archivosService = archivosService;
        this.filesPath = filesPath;
    }
    
    @Override
    public List<CalificacionProductos> listar() {
        return repositorio.findAll();
    }

    @Override
    public CalificacionProductos listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public CalificacionProductos add(CalificacionProductos c) {
        return repositorio.save(c);
    }

    @Override
    public CalificacionProductos edit(CalificacionProductos c) {
        return repositorio.save(c);
    }
    
    @Override
    public List<CalificacionProductos> listarByIdEvidencia(int id_evidencia) {
        return repositorio.findByEvidenciaId_Id(id_evidencia);
    }
    
    @Override
    public CalificacionProductos delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Resource downloadFile(Integer archivoId) {
        return archivosService.downloadFile(archivoId.toString());
    }
}
