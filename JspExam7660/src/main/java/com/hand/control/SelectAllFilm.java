package com.hand.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.model.IFilmLanguageModel;
import com.hand.model.impl.IFilmLanguageModelImpl;
import com.hand.vo.FilmLanguage;

public class SelectAllFilm extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		IFilmLanguageModel ifilmlanguageModel = new IFilmLanguageModelImpl();
		List<FilmLanguage> list = ifilmlanguageModel.selectFilmLanguage();
		request.setAttribute("allFilm", list);
		request.getRequestDispatcher("operation/selectAllFilm.jsp").forward(request, response);
	}

}
