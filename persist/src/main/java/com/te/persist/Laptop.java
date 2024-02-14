package com.te.persist;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {
@Id
 private int lid;
 private String laptopName;
 @ManyToOne
 private Student stud;
 

 
public Student getStud() {
	return stud;
}
public void setStud(Student stud) {
	this.stud = stud;
}
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getLaptopName() {
	return laptopName;
}
public void setLaptopName(String laptopName) {
	this.laptopName = laptopName;
}
 
}
