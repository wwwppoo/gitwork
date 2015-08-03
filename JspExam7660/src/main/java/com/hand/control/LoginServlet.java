package com.hand.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.model.ICustomerModel;
import com.hand.model.impl.ICustomerModelImpl;

public class LoginServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ICustomerModel icustomerModel = new ICustomerModelImpl();
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		System.out.println(username);
		boolean result = icustomerModel.matchUsername(username);
		if(result){
			request.getSession().setAttribute("username", username);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else{
			response.sendRedirect("login/login.jsp");
		}
		
		
	}

}
