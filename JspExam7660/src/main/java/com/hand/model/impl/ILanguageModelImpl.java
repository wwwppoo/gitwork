package com.hand.model.impl;

import java.util.List;

import com.hand.dao.ILanguageDao;
import com.hand.dao.impl.ILanguageDaoImpl;
import com.hand.model.IFilmLanguageModel;
import com.hand.model.ILanguageModel;
import com.hand.vo.Language;

public class ILanguageModelImpl implements ILanguageModel{
	ILanguageDao ilanguageModel = new ILanguageDaoImpl();

	public List<Language> selectAllLanguage() {
		
		return ilanguageModel.selectAllLanguage();
	}

}
