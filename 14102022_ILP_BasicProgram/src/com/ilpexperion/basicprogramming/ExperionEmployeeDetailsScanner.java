package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class ExperionEmployeeDetailsScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String trainingName = "**************Welcome to ILP Program*************";
		String employeeName;
		int employeeAge;
		char employeeGender;
		float employeeCGPA;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Employee Name: ");
		employeeName=scanner.nextLine();
		System.out.println("Enter your Employee Age: ");
		employeeAge=scanner.nextInt();
		System.out.println("Enter your Employee Gender: ");
		employeeGender=scanner.next().charAt(0);
		System.out.println("Enter your Employee CGPA: ");
		employeeCGPA=scanner.nextFloat();

		System.out.println(trainingName);
		System.out.println("Name" + "		" + "Age" + "	" + "Gender" + "	" + "CGPA");
		System.out.println(employeeName + "\t" + employeeAge + "\t" + employeeGender + "\t" + employeeCGPA);

	}

}
