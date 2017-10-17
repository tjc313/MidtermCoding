package com.cisc181.core;

import java.util.UUID;

public class Course {
	
	protected UUID courseID;
	protected String courseName;
	protected int gradePts;
	protected com.cisc181.eNums.eMajor eMajor;
	
	public Course(UUID courseID, String courseName, int gradePts, com.cisc181.eNums.eMajor eMajor) {
		this.courseID = UUID.randomUUID();
		this.courseName = courseName;
		this.gradePts = gradePts;
		this.eMajor =eMajor;
	}
	public UUID getCourseID() {
		return courseID;
	}
	private void setCourseID(UUID courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	private void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getGradePts() {
		return gradePts;
	}
	private void setGradePts(int gradePts) {
		this.gradePts = gradePts;
	}
	public com.cisc181.eNums.eMajor geteMajor() {
		return eMajor;
	}
	private void seteMajor(com.cisc181.eNums.eMajor eMajor) {
		this.eMajor = eMajor;
	}
	
	

}
