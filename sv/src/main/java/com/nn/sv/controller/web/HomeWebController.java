package com.nn.sv.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nn.sv.common.BaseController;


@Controller
public class HomeWebController extends BaseController {

	@GetMapping("/")
	public String root() {
		return "web/index";
	}

	@GetMapping("/customer")
	public String customer() {
		return "web/customer";
	}
	
	@GetMapping("/view-trip")
	public String viewTrip() {
		return "web/view-trip";
	}
	
	@GetMapping("/book")
	public String book() {
		return "web/book";
	}
	
	@GetMapping("/about")
	public String about() {
		return "web/about";
	}
	
	@GetMapping("/travel")
	public String travel() {
		return "web/travel";
	}
	
	@GetMapping("/blog")
	public String blog() {
		return "web/blog";
	}
	
	
	@GetMapping("/contact")
	public String contact() {
		return "web/contact";
	}
}
