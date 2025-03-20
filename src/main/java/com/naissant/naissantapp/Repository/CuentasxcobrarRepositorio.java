/**
 * Desarrollado por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2023
 **/

package com.naissant.naissantapp.Repository;

import com.naissant.naissantapp.Entity.Cuentasxcobrar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface CuentasxcobrarRepositorio extends JpaRepository<Cuentasxcobrar, Integer>{

    List<Cuentasxcobrar>findByNumCxc(Double num_cxc);
    List<Cuentasxcobrar>findByFacturaId_Id(int id_factura);
    List<Cuentasxcobrar>findByEstudianteId_Id(int id_estudiante);
    List<Cuentasxcobrar>findByAnoSemestreId_Id(int id_ano_semestre);
}
