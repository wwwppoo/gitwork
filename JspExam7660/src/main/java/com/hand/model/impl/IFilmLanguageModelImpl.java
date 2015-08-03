package com.hand.model.impl;

import java.util.List;

import com.hand.dao.IFilmLanguageDao;
import com.hand.dao.impl.IFilmLanguageDaoImpl;
import com.hand.model.IFilmLanguageModel;
import com.hand.vo.FilmLanguage;

public class IFilmLanguageModelImpl implements IFilmLanguageModel{
	IFilmLanguageDao ifilmLanguage = new IFilmLanguageDaoImpl();

	public List<FilmLanguage> selectFilmLanguage() {
		return ifilmLanguage.selectFilmLanguage();
	}
	
	public boolean deleteFilmLanguage(int fid) {
		return ifilmLanguage.deleteFilmLanguage(fid)>0?true:false;
	}

	public boolean insertFilmLanguage(FilmLanguage filmLanguage) {
		
		return ifilmLanguage.insertFilmLanguage(filmLanguage)>0?true:false;
	}

	public FilmLanguage selectFilmId(int fid) {
		return ifilmLanguage.selectFilmId(fid);
	}

	public boolean updateFilm(FilmLanguage filmLanguage) {
		return ifilmLanguage.updateFilm(filmLanguage)>0?true:false;
	}

}
