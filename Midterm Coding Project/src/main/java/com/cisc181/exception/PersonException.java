package com.cisc181.exception;

import com.cisc181.core.Person;

public class PersonException extends Exception {
	String message;
	Person person = this.getPerson();
	
	public PersonException(String message) {
		this.setPerson(person);
		this.message = "That date of birth is too old";
	}

	public String getMessage() {
		return message;
	}

	private void setMessage(String message) {
		this.message = message;
	}

	public Person getPerson() {
		return person;
	}

	private void setPerson(Person person) {
		this.person = person;
	}

}

