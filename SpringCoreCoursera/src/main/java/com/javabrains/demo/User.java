package com.javabrains.demo;

public class User {

	private String name;
	private String surname;
	private String course;
	private Double grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Double getGrade() {
		return grade;
	}
	public void setGrade(Double grade) {
		this.grade = grade;
	}
	public User(String name, String surname, String course, Double grade) {
		super();
		this.name = name;
		this.surname = surname;
		this.course = course;
		this.grade = grade;
	}
	
	
}
