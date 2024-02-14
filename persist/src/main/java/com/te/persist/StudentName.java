package com.te.persist;

import jakarta.persistence.Embeddable;

@Embeddable
public class StudentName {
	private String firstName;
	private String middleName;
	private String lasName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLasName() {
		return lasName;
	}
	public void setLasName(String lasName) {
		this.lasName = lasName;
	}
	@Override
	public String toString() {
		return "StudentName [firstName=" + firstName + ", middleName=" + middleName + ", lasName=" + lasName + "]";
	}
	
	

}
