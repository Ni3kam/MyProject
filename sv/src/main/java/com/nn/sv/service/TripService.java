package com.nn.sv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nn.sv.model.TripEntity;
import com.nn.sv.repository.TripRepository;

@Service
public class TripService {
	
	@Autowired
	private TripRepository tripRepository;
	
	public TripEntity save(TripEntity tripEntity) {
		return tripRepository.save(tripEntity);
	}
	
	public TripEntity update(TripEntity tripEntity) {
		return tripRepository.save(tripEntity);
	}
	
	public TripEntity findById(Long tripId) {
		return tripRepository.findById(tripId).get();
	}
	
	public List<TripEntity> findAll(){
		return tripRepository.findAll();
	}

}
