package com.nn.sv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RouteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "trip_arrange_id", nullable = false)
	private Long tripArrangeId;
	
	@Column(name = "location")
	private String location;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTripArrangeId() {
		return tripArrangeId;
	}

	public void setTripArrangeId(Long tripArrangeId) {
		this.tripArrangeId = tripArrangeId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
