package com.hari.json.Jackson_Project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)   //used to ignore unknown properties if any
//present in the JSON data.
public class Employee {
	private int empId;
	private String empName;
	private int empSalary;
	private String[] languagesKnown;


	@Override
	public String toString() {
		return "empId :"+empId+" empName : "+empName+" empSalary : "+empSalary
				+" languagesKnown : "+languagesKnown;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String[] getLanguagesKnown() {
		return languagesKnown;
	}
	public void setLanguagesKnown(String[] languagesKnown) {
		this.languagesKnown = languagesKnown;
	}


}
