package com.hand.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.model.IFilmLanguageModel;
import com.hand.model.ILanguageModel;
import com.hand.model.impl.IFilmLanguageModelImpl;
import com.hand.model.impl.ILanguageModelImpl;
import com.hand.vo.FilmLanguage;
import com.hand.vo.Language;

public class AddFilmServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		int language_id = Integer.parseInt(request.getParameter("language_id"));
		FilmLanguage filmLanguage = new FilmLanguage(title,description,language_id);
		
		IFilmLanguageModel ifilmLanguageModel = new IFilmLanguageModelImpl();
		boolean result = ifilmLanguageModel.insertFilmLanguage(filmLanguage);
		if(result){
			request.getRequestDispatcher("selectAllFilm").forward(request, response);
		}
	}

}
