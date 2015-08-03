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

public class UpdateFilmServlet extends HttpServlet {

	
	 
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		IFilmLanguageModel ifilmlanguageModel = new IFilmLanguageModelImpl();
		int fid = Integer.parseInt(request.getParameter("fid"));
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		int language = Integer.parseInt(request.getParameter("language_id"));
		FilmLanguage film = new FilmLanguage(fid, title, description, language);
		boolean result = ifilmlanguageModel.updateFilm(film);
		if(result){
			request.getRequestDispatcher("selectAllFilm").forward(request, response);
		}
	}

}
