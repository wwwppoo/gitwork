package com.hand.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.model.IFilmLanguageModel;
import com.hand.model.impl.IFilmLanguageModelImpl;
import com.hand.vo.FilmLanguage;

public class SelectFilmIdServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int fid = Integer.parseInt(request.getParameter("fid"));
		IFilmLanguageModel ifilmlanguageModel = new IFilmLanguageModelImpl();
		FilmLanguage filmLanguage = ifilmlanguageModel.selectFilmId(fid);
		request.getSession().setAttribute("fid", fid);
		request.setAttribute("title", filmLanguage.getTitle());
		request.setAttribute("description", filmLanguage.getDescription());
		request.setAttribute("language_id", filmLanguage.getLanguage_id());
		request.getRequestDispatcher("operation/updateFilm.jsp").forward(request, response);
		
	}

}
