package com.nn.sv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nn.sv.model.TripEntity;

public interface TripRepository extends JpaRepository<TripEntity, Long>{

}
