package com.ilpexperion.basicprogramming;

public class ExperionEmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String main_heading = "**************Welcome to ILP Program*************";
		String col1_heading = "Name";
		String col2_heading = "Age";
		String col3_heading = "Gender";
		String col4_heading = "CGPA";
		String employeeName = "Kiran Mariam";
		int employeeAge = 22;
		char employeeGender = 'F';
		float employeeCGPA = 8.22f;//by default system takes double to convert it to float use suffix f
		System.out.println(main_heading);
		System.out.println(col1_heading + "\t\t" + col2_heading + "\t" + col3_heading + "\t" + col4_heading);
		System.out.println(employeeName + "\t" + employeeAge + "\t" + employeeGender + "\t" + employeeCGPA);

	}

}
