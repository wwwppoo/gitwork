package com.hand.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilter implements Filter {

	public void destroy() {
		
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		Object username = req.getSession().getAttribute("username");
		if(username != null){
			chain.doFilter(request, response);
		}else{
			request.getRequestDispatcher("login/login.jsp").forward(request, response);
		}
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		
		
	}

}
