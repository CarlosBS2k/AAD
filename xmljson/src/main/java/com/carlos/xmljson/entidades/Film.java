package com.carlos.xmljson.entidades;

public class Film {
	private String title;

	public Film(String title) {
		super();
		this.title = title;
	}

	@Override
	public String toString() {
		return "Film [name=" + title + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
