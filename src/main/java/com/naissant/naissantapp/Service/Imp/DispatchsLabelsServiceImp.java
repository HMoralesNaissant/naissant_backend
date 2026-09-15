/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2026
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.DispatchsLabels;
import com.naissant.naissantapp.Repository.DispatchsLabelsRepository;
import com.naissant.naissantapp.Service.DispatchsLabelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DispatchsLabelsServiceImp implements DispatchsLabelsService{
    @Autowired
    private DispatchsLabelsRepository repository;
    
    @Override
    public List<DispatchsLabels> listar() {
        return repository.findAll();
    }

    @Override
    public DispatchsLabels listarId(int id) {
        return repository.findById(id).get();
    }

    @Override
    public DispatchsLabels add(DispatchsLabels d) {
        return repository.save(d);
    }

    @Override
    public DispatchsLabels edit(DispatchsLabels d) {
        return repository.save(d);
    }
    
    @Override
    public List<DispatchsLabels> listarByIdDispatch(int id_dispatch) {
        return repository.findByDispatchId_Id(id_dispatch);
    }

    @Override
    public List<DispatchsLabels> listarByIdInvoice(int id_invoice) {
        return repository.findByInvoiceId_Id(id_invoice);
    }

    @Override
    public List<DispatchsLabels> listarByIdConveyor(int id_conveyor) {
        return repository.findByConveyorId_Id(id_conveyor);
    }

    @Override
    public List<DispatchsLabels> listarByIdConveyorAcc(int id_conveyor_acc) {
        return repository.findByConveyorAccId_Id(id_conveyor_acc);
    }

    @Override
    public List<DispatchsLabels> listarByIdOrigin(int id_origin) {
        return repository.findByOriginId_Id(id_origin);
    }

    @Override
    public List<DispatchsLabels> listarByIdDestination(int id_destination) {
        return repository.findByDestinationId_Id(id_destination);
    }

    @Override
    public DispatchsLabels delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }
}
