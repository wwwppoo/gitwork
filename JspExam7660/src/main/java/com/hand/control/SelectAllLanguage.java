package com.hand.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.model.ILanguageModel;
import com.hand.model.impl.ILanguageModelImpl;
import com.hand.vo.Language;

public class SelectAllLanguage extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ILanguageModel ilanguageModel = new ILanguageModelImpl();
		List<Language> list = ilanguageModel.selectAllLanguage();
		request.setCharacterEncoding("UTF-8");
		request.setAttribute("allLanguage", list);
		request.getRequestDispatcher("operation/addFilm.jsp").forward(request, response);
		
	}

}
