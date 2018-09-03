package com.capgemini.test;

public class Employee {
	String employeeName;
	long employeeId;
	double basicSalary;
	double medicalPercent;
	double Hra;
	double pf;
	double grossSalary;
	double netSalary;
	double medical;
	 public Employee(String employeeName,long employeeid,double basicSalary, double medicalPercent)
	 {
		 this.employeeName=employeeName;
		 this.employeeId=employeeid;
		 this.basicSalary=basicSalary;
		 this.medicalPercent=medicalPercent;
	 }
	
	public  double actualSalary()
	{
		    medical=(basicSalary*medicalPercent)/100;
            Hra=basicSalary/2;
            pf=(basicSalary*12)/100;
            grossSalary=Hra+basicSalary+medical;
            netSalary=grossSalary-(pf-200.00);
            return netSalary;

	}
	public void employeeDetails()
	{
		System.out.println("Employye id "+employeeId+" Net Salary"+netSalary);
	}

}
