package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SecondSmallestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input 3 numbers and print the second smallest of the three. 

		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int temp1,temp2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		firstNumber=scanner.nextInt();
		System.out.println("Enter the second number: ");
		secondNumber=scanner.nextInt();
		System.out.println("Enter the third number: ");
		thirdNumber=scanner.nextInt();
		
		if(firstNumber>secondNumber)
			temp1=firstNumber;
		else
			temp1=secondNumber;
		
		if(secondNumber>thirdNumber)
			temp2=secondNumber;
		else
			temp2=thirdNumber;
		
		if(temp1<temp2)
			System.out.println("The second smallest number is "+temp1);
		else
			System.out.println("The second smallest number is "+temp2);
	}

}
