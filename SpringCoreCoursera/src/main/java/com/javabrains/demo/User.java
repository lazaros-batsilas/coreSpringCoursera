package com.javabrains.demo;

public class User {

	private String name;
	private String surname;
	private String dept;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Double getGrade() {
		return grade;
	}
	public void setGrade(Double grade) {
		this.grade = grade;
	}
	public User(String name, String surname, String dept, Double grade) {
		super();
		this.name = name;
		this.surname = surname;
		this.dept = dept;
		this.grade = grade;
	}
	
}
