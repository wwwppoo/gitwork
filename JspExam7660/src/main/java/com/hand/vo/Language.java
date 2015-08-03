package com.hand.vo;

public class Language {
	private int language_id;
	private String language;
	
	public Language() {
	}
	
	public Language(int language_id, String language) {
		this.language_id = language_id;
		this.language = language;
	}

	public int getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	

}
