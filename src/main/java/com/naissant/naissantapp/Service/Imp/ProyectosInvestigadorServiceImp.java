/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 * */

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.ProyectosInvestigador;
import com.naissant.naissantapp.Repository.ProyectosInvestigadorRepositorio;
import com.naissant.naissantapp.Service.ProyectosInvestigadorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosInvestigadorServiceImp implements ProyectosInvestigadorService {

    @Autowired
    private ProyectosInvestigadorRepositorio repositorio;

    @Override
    public List<ProyectosInvestigador> listar() {
        return repositorio.findAll();
    }

    @Override
    public ProyectosInvestigador listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public ProyectosInvestigador add(ProyectosInvestigador p) {
        return repositorio.save(p);
    }

    @Override
    public ProyectosInvestigador edit(ProyectosInvestigador p) {
        return repositorio.save(p);
    }

    @Override
    public List<ProyectosInvestigador> listarByIdProyecto(int id_proyecto) {
        return repositorio.findByProyectoId_Id(id_proyecto);
    }

    @Override
    public ProyectosInvestigador delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
