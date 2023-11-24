package com.nn.sv.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nn.sv.model.EnqueryEntity;
import com.nn.sv.service.EnqueryService;

@RestController
@RequestMapping("/sv/api")
public class EnqueryController {
	
	@Autowired
	private EnqueryService enqueryService;
	
	@PostMapping("/enquery")
	public void save(@RequestBody EnqueryEntity enqueryEntity) {
		enqueryService.save(enqueryEntity);
	}

}
