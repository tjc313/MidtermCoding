package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	
	private UUID semesterID;
	private Date startDate;
	private Date endDate;
	
	public Semester(UUID semesterID, Date startDate, Date endDate) {
		this.semesterID = UUID.randomUUID();
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	
	public UUID getSemesterID() {
		return semesterID;
	}
	private void setSemesterID(UUID semesterID) {
		this.semesterID = semesterID;
	}
	public Date getStartDate() {
		return startDate;
	}
	private void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	private void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
