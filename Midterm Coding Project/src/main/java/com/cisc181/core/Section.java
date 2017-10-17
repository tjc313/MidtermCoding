package com.cisc181.core;

import java.util.UUID;

public class Section extends Course{
	
	private UUID courseID;
	private UUID semesterID;
	private UUID sectionID;
	private int roomID;
	
	public Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID, String courseName, int gradePts, com.cisc181.eNums.eMajor eMajor) {
		super(courseID, courseName, gradePts, eMajor);
		this.sectionID = UUID.randomUUID();
		this.roomID = roomID;
		
	}
	
	
	public UUID getCourseID() {
		return courseID;
	}
	private void setCourseID(UUID courseID) {
		this.courseID = courseID;
	}
	public UUID getSemesterID() {
		return semesterID;
	}
	private void setSemesterID(UUID semesterID) {
		this.semesterID = semesterID;
	}
	public UUID getSectionID() {
		return sectionID;
	}
	private void setSectionID(UUID sectionID) {
		this.sectionID = sectionID;
	}
	public int getRoomID() {
		return roomID;
	}
	private void setRoomID(int roomID) {
		this.roomID = roomID;
	}

}
