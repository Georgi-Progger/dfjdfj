package com.example.taxi_rest_api.repository;

import com.example.taxi_rest_api.model.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<DriverEntity, Long> {
}
