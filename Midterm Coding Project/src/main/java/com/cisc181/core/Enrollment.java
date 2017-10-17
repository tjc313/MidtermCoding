package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	private UUID sectionID;
	private UUID studentID;
	private UUID enrollmentID;
	private double grade;
	
	private Enrollment() {
		
	}
	
	public Enrollment(UUID sectionID, UUID studentID) {
		this.sectionID = sectionID;
		this.studentID = studentID;
		this.enrollmentID = UUID.randomUUID();
		this.grade = grade;
	}
	
	public UUID getSectionID() {
		return sectionID;
	}
	private void setSectionID(UUID sectionID) {
		this.sectionID = sectionID;
	}
	public UUID getStudentID() {
		return studentID;
	}
	private void setStudentID(UUID studentID) {
		this.studentID = studentID;
	}
	public UUID getEnrollmentID() {
		return enrollmentID;
	}
	private void setEnrollmentID(UUID enrollmentID) {
		this.enrollmentID = enrollmentID;
	}
	public double getGrade() {
		return grade;
	}
	private void setGrade(double grade) {
		this.grade = grade;
	}
	
	
	

}
