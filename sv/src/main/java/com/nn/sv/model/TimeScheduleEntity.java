package com.nn.sv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TimeScheduleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "trip_arrange_id", nullable = false)
	private Long tripArrangeId;
	
	@Column(name = "day")
	private Integer day;
	
	@Column(name = "time")
	private String time;
	
	@Column(name = "activity")
	private String activity;

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

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

}
