package com.experion.basicprograming;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input an integer and print the corresponding day of the week. Eg : 1 -> Monday, 2-> Tuesday

		int dayNumber;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day number: ");
		dayNumber=scanner.nextInt();

		switch(dayNumber)
		{
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("Sunday");
		break;
		default: System.out.println("Invalid number");
		}
		

	}

}
