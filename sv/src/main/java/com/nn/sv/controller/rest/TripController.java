package com.nn.sv.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nn.sv.common.BaseController;
import com.nn.sv.common.ResponceEntity;
import com.nn.sv.model.TripEntity;
import com.nn.sv.service.TripService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/sv/api/trip")
public class TripController extends BaseController {

	@Autowired
	private TripService tripService;

	@PostMapping("/save")
	public ResponceEntity save(HttpServletRequest request, HttpServletResponse response, @RequestBody TripEntity trip) {
		ResponceEntity result = new ResponceEntity();
		if(isLogin(request, response)) {
			result.setStatus(200);
			result.setMsg("Trip Save");
			trip.setCreatedBy(getLoggedInUser(request, response).getUserName());
			result.setData(tripService.save(trip));
		} else {
			result.setStatus(300);
			result.setMsg("Error");
			result.setData(result);
		}
		return result;

	}

}
