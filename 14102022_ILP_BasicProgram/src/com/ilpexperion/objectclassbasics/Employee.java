package com.ilpexperion.objectclassbasics;

public class Employee {

	String employeeName = "Kiran Mariam";
	int employeeAge = 22;
	char employeeGender = 'F';
	float employeeCGPA = 8.22f;
	
	
	public void displayEmployeeDetails()
	{
		System.out.println("**************Welcome to ILP Program*************");
//		System.out.println("Name" + "		" + "Age" + "	" + "Gender" + "	" + "CGPA");
		System.out.println("Name\t\tAge\tGender\tCGPA");
		System.out.println(employeeName + "	" + employeeAge + "	" + employeeGender + "	" + employeeCGPA);
	}
}
