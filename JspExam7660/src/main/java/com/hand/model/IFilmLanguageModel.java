package com.hand.model;

import java.util.List;

import com.hand.vo.FilmLanguage;

public interface IFilmLanguageModel {
	
	List<FilmLanguage> selectFilmLanguage();
	
	boolean deleteFilmLanguage(int fid);
	
	boolean insertFilmLanguage(FilmLanguage filmLanguage);
	
	FilmLanguage selectFilmId(int fid);
	
	boolean updateFilm(FilmLanguage filmLanguage);

}
