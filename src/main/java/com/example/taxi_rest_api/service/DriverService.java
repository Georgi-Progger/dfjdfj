package com.example.taxi_rest_api.service;

import com.example.taxi_rest_api.model.DriverEntity;
import com.example.taxi_rest_api.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService implements GenericService<DriverEntity, Long> {
    private final DriverRepository driverRepository;
    @Autowired
    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Override
    public DriverEntity getById(Long aLong) {
        return  driverRepository.getById(aLong);
    }

    @Override
    public List<DriverEntity> getAll() {
        return driverRepository.findAll();
    }

    @Override
    public DriverEntity save(DriverEntity orderEntity) {
        return driverRepository.save(orderEntity);
    }

    @Override
    public void deleteById(Long aLong) {
        driverRepository.deleteById(aLong);
    }
}
