package com.rg.egen.service;

import com.rg.egen.entity.Vehicle;
import com.rg.egen.exception.VehicleNotFoundException;
import com.rg.egen.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository repository;

    @Autowired
    public VehicleServiceImpl(VehicleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Vehicle> findAll() {
        return (List<Vehicle>) repository.findAll();
    }

    @Override
    public Vehicle findOne(String vin) {
        Optional<Vehicle> existing = repository.findByVin(vin);
        return existing.orElseThrow(() -> new VehicleNotFoundException("Vehicle with VIN:- "+vin+" not found"));
    }

    @Override
    public Vehicle create(Vehicle v) {
        return null;
    }

    @Override
    public List<Vehicle> update(List<Vehicle> vList) {
        vList.forEach(v -> {
            if(!repository.findByVin(v.getVin()).isPresent()) {
                System.out.println(v.getLastServiceDate());
            }
        });
        return (List<Vehicle>) repository.saveAll(vList);
    }

    @Override
    public Vehicle delete(String vin) {
        return null;
    }

}
