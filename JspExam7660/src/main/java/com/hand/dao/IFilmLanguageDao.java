package com.hand.dao;

import java.util.List;

import com.hand.vo.FilmLanguage;

public interface IFilmLanguageDao {
	
	List<FilmLanguage> selectFilmLanguage();
	
	int deleteFilmLanguage(int fid);
	
	int insertFilmLanguage(FilmLanguage filmLanguage);
	
	FilmLanguage selectFilmId(int fid);
	
	int updateFilm(FilmLanguage filmLanguage);

}
