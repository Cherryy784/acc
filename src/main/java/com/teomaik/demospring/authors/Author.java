package com.teomaik.demospring.authors;

public class Author {

    private Integer id;
	private String fisrtName;
	private String lastName;
	private String dateOfBirth;
	
	public Author(Integer id, String fisrtName, String lastName, String dateOfBirth) {
		this.id = id;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
