package com.greatlearning.model;

public class Employee {
	//Private members of class Employee
	private String firstName;
	private String lastName;
	
	//Parameterized constructor of class Employee, to pass firstName and lastName
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//Getters and Setters of private members of class Employee
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
