package com.nn.sv.common;

import com.nn.sv.model.UserEntity;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class BaseController {
	
	public void login(HttpServletRequest request, HttpServletResponse response, UserEntity user) {
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
	};

    public UserEntity getLoggedInUser(HttpServletRequest request, HttpServletResponse response) {
        try {
            HttpSession session = request.getSession();
            UserEntity user = (UserEntity) session.getAttribute("user");
            return user;
        } catch (Exception e) {
            return null;
        }
    }
    public boolean isLogin(HttpServletRequest request, HttpServletResponse response) {
        try {
            HttpSession session = request.getSession();
            UserEntity user = (UserEntity) session.getAttribute("user");
            if(user != null) {
            	 return true;
            } else {
            	 return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        session.invalidate();
    }


}
