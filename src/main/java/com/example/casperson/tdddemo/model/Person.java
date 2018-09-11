package com.example.casperson.tdddemo.model;

public class Person {


	private String firstName;
	private String lastName;

	public Person() {
		// TODO Auto-generated constructor stub
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String formatFullName() {
		// TODO Auto-generated method stub
		return firstName + " " + lastName;
	}

	
}
