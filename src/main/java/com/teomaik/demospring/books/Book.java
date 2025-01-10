package com.teomaik.demospring.books;

import java.util.ArrayList;
import java.util.List;

import com.teomaik.demospring.authors.Author;
import com.teomaik.demospring.themes.Theme;

public class Book {

	private Integer id;
	private String title;
	private Author author;
	private String publiser;
	private int publishYear;
	private String description;
	List<Theme> themes = new ArrayList<Theme>();

	public Book(Integer id, String title, Author author, String publiser, int publishYear, String description,
			List<Theme> theme) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publiser = publiser;
		this.publishYear = publishYear;
		this.themes = theme;
		this.description = description;
	}

	public void addTheme(Theme theme) {
		this.themes.add(theme);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getPubliser() {
		return publiser;
	}

	public void setPubliser(String publiser) {
		this.publiser = publiser;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public List<Theme> getTheme() {
		return themes;
	}

	public void setTheme(List<Theme> theme) {
		this.themes = theme;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
