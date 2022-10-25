package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class LastDigitEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input a number and print whether the last digit is even or odd. 

		int number;
		int reminder;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number=scanner.nextInt();
		reminder = number%10;
		if(reminder%2==0)
			System.out.println("The last digit of "+number+", "+reminder+" is an even number");
		else
			System.out.println("The last digit of "+number+", "+reminder+" is an odd number");
	}

}
