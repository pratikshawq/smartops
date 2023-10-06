package com.example.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="STUD1")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long studId;
	private String firstName;
	private String lastName;
	private int rollno;
	private String grade;
	public Student(String firstName, String lastName, int rollno, String grade) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollno = rollno;
		this.grade = grade;
	}
	
	public Student()
	{
		
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
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public long getStudId() {
		return studId;
	}

	public void setStudId(long studId) {
		this.studId = studId;
	}
}
	