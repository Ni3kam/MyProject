package com.nn.sv.controller.web;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nn.sv.common.BaseController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class HomeAdminController extends BaseController  {

	@GetMapping("/login")
	public String login() {
		return "admin/login";
	}
	
	@GetMapping(value = "/logout")
	public String logoutRest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		logout(request, response);
		return "admin/login";
	}
	
	@GetMapping(value = "/home")
	public String home(HttpServletRequest request, HttpServletResponse response) throws IOException{
		return isLogin(request, response) ? "admin/home" :"admin/login";
	}
	
	@GetMapping(value = "/create-trips")
	public String createTrip(HttpServletRequest request, HttpServletResponse response) throws IOException{
		return isLogin(request, response) ? "admin/create-trips" :"admin/login";
	}
}
