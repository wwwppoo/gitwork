package com.hand.vo;

public class FilmLanguage {
	private int film_id;
	private String title;
	private String description;
	private int language_id;
	private String language;
	
	public FilmLanguage() {
	}
	public FilmLanguage(String title, String description,
			int language_id) {
		this.title = title;
		this.description = description;
		this.language_id = language_id;
	}
	
	public FilmLanguage(int film_id,String title, String description,
			int language_id) {
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.language_id = language_id;
	}
	
	public FilmLanguage(int film_id, String title, String description,
			String language) {
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.language = language;
	}
	
	public FilmLanguage(int film_id, String title, String description,
			int language_id, String language) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.language_id = language_id;
		this.language = language;
	}
	
	
	public int getFilm_id() {
		return film_id;
	}
	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}
	
	

}
