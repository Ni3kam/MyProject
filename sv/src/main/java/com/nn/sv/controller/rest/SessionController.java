package com.nn.sv.controller.rest;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nn.sv.common.BaseController;
import com.nn.sv.model.UserEntity;
import com.nn.sv.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class SessionController extends BaseController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "/login")
	public Map<String, Object> loginRestUser(HttpServletRequest request, HttpServletResponse response,
			@RequestBody UserEntity user) throws IOException {
		return loginRest(request, response, user, "admin");
	}

	private Map<String, Object> loginRest(HttpServletRequest request, HttpServletResponse response, @RequestBody UserEntity user, String designation) throws IOException {
        Map<String, Object> result = new HashMap<>();
        UserEntity userEntity = new UserEntity();
        userEntity = userService.findByUsername(user.getUserName());
        if (userEntity != null) {
                if (userEntity.getPassword().equals(user.getPassword())) {
                        result.put("sucess", "Login successful");
                        userEntity.setLastLogin(new Date());
                        login(request, response, userEntity);
			        return result;
			    } else {
			    	result.put("Fail", "Wrong Password");
		            return result;
			    }
        } else {
        	result.put("Fail", "User Not Found");
            return result;
        }
	}

}
