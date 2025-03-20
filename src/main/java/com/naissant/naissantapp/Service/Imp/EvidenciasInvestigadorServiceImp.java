/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2022
 * */

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.EvidenciasInvestigador;
import com.naissant.naissantapp.Repository.EvidenciasInvestigadorRepositorio;
import com.naissant.naissantapp.Service.EvidenciasInvestigadorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvidenciasInvestigadorServiceImp implements EvidenciasInvestigadorService {

    @Autowired
    private EvidenciasInvestigadorRepositorio repositorio;

    @Override
    public List<EvidenciasInvestigador> listar() {
        return repositorio.findAll();
    }

    @Override
    public EvidenciasInvestigador listarId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public EvidenciasInvestigador add(EvidenciasInvestigador v) {
        return repositorio.save(v);
    }

    @Override
    public EvidenciasInvestigador edit(EvidenciasInvestigador v) {
        return repositorio.save(v);
    }

    @Override
    public List<EvidenciasInvestigador> listarByIdEvidencia(int id_evidencia) {
        return repositorio.findByEvidenciaId_Id(id_evidencia);
    }

    @Override
    public EvidenciasInvestigador delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
