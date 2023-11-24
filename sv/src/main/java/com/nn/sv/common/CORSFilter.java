package com.nn.sv.common;


import java.io.IOException;


import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CORSFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;

		httpResponse.setHeader("Access-Control-Allow-Origin", "*");
		httpResponse.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		httpResponse.setHeader("Access-Control-Allow-Headers", "x-requested-with, origin, content-type, accept");
		httpResponse.setHeader("Access-Control-Max-Age", "1800");

		//String url = httpRequest.getServletPath();
		
		//if (url.equals("/login") || securityTokenHandler.checkLogin(httpRequest, httpResponse)) {
			chain.doFilter(request, response);
		//} else {
		//	httpResponse.sendRedirect("/login");
		//}
	}

}