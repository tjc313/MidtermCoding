package com.cisc181.core;

import java.util.ArrayList;
import java.util.Date;

import com.cisc181.eNums.eTitle;
import com.cisc181.exception.PersonException;

public class Staff extends Employee {

	 private eTitle Title;

	   public Staff(eTitle title){
	        this.Title = title;
	    }

	    public void setTitle(eTitle title){
	        this.Title = title;
	    }
	    public eTitle getTitle(){
	        return this.Title;
	    }

    

    
	public Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate,
			eTitle Title) throws PersonException  
	
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		this.Title = Title;
	}
	
	public static Staff BEN  = new Staff("Benjamin", "Frank", "Linn", new Date(1990, 03, 05), "5 Lightening Ave", "732-840-4332", "Bfrank@udel.edu", "T TH 3-6pm", 4, 45900.00, new Date(2014, 03, 07), com.cisc181.eNums.eTitle.MR);
	public static Staff JEN = new Staff("Jennifer", "Ruby", "Linn", new Date(1987, 20, 10), "8 Pine Street", "840-917-4332", "Jlinnk@udel.edu", "M TH 12-2pm", 5, 52700.00, new Date(2010, 11, 07), com.cisc181.eNums.eTitle.MRS);
	public static Staff CRAIG = new Staff("craig", "Tyler", "Andrews", new Date(1978, 06, 11), "23 Memorial Blvd", "619-324-0098", "Candrews@udel.edu", "M W 5-7pm", 6, 71000.00, new Date(2005, 07, 27), com.cisc181.eNums.eTitle.MR);
	public static Staff JAN = new Staff("Janice", "Devon", "Cuba", new Date(1963, 03,03), "6 Carrie Drive", "732-237-8990", "Jcuba@udel.edu", "TH F 1-3pm", 4, 68700.00, new Date(2007, 05, 17), com.cisc181.eNums.eTitle.MRS);
	public static Staff JESS = new Staff("Jessica", "Carson", "Lerner", new Date(1994, 07,23), "14 Amstel Ave", "732-239-7740", "Jlerner@udel.edu", "T TH 3-6pm", 2, 40000.00, new Date(2016, 01, 29), com.cisc181.eNums.eTitle.MS);

	public static ArrayList<Staff> sampleStaff = new ArrayList<Staff>();
	
	public static void getnerateSamples() {
		sampleStaff.add(BEN);
		sampleStaff.add(JEN);
		sampleStaff.add(CRAIG);
		sampleStaff.add(JAN);
		sampleStaff.add(JESS);
	}
	
	public double computeAvgSalery() {
		double i = 0;
		for (Staff staff : sampleStaff) {
			double sum = this.getSalary() +  i;
			i = sum;
		}
		return sum / sampleStaff.size();
	}
	
	
	
	
	

	
}