package com.hand.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.model.IFilmLanguageModel;
import com.hand.model.impl.IFilmLanguageModelImpl;

public class DeleteFilmServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		IFilmLanguageModel ifilmLanguageModel = new IFilmLanguageModelImpl();
		int fid = Integer.parseInt(request.getParameter("fid"));
		boolean result = ifilmLanguageModel.deleteFilmLanguage(fid);
		if(result){
			request.getRequestDispatcher("selectAllFilm").forward(request, response);
		}
	}

}
