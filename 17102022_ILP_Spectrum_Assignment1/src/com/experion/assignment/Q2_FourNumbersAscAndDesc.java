package com.experion.assignment;

import java.util.Scanner;

public class Q2_FourNumbersAscAndDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int fourthNumber;
		int temp;
		System.out.println("enter the numbers: ");
		firstNumber=scanner.nextInt();
		secondNumber=scanner.nextInt();
		thirdNumber=scanner.nextInt();
		fourthNumber=scanner.nextInt();
		
		if((firstNumber<secondNumber)&&(firstNumber<thirdNumber)&&(firstNumber<fourthNumber)) {
			temp=fourthNumber;
			fourthNumber=firstNumber;
			firstNumber=temp;
			if((firstNumber<secondNumber)&&(firstNumber<thirdNumber)) {
				temp=thirdNumber;
				thirdNumber=firstNumber;
				firstNumber=temp;
				if(firstNumber<secondNumber) {
					temp=secondNumber;
					secondNumber=firstNumber;
					firstNumber=temp;
					
				}
				
			}
		}
		if((secondNumber<thirdNumber)&&(secondNumber<firstNumber)&&(secondNumber<fourthNumber)) {
			temp=fourthNumber;
			fourthNumber=secondNumber;
			secondNumber=temp;
			if((secondNumber<firstNumber)&&(secondNumber<thirdNumber)) {
				temp=thirdNumber;
				thirdNumber=secondNumber;
				secondNumber=temp;
				if(secondNumber>firstNumber) {
					temp=firstNumber;
					firstNumber=secondNumber;
					secondNumber=temp;
				}
				
			}
		}
		if((thirdNumber<secondNumber)&&(thirdNumber<firstNumber)&&(thirdNumber<fourthNumber)) {
			temp=fourthNumber;
			fourthNumber=thirdNumber;
			thirdNumber=temp;
			if((thirdNumber>firstNumber)&&(thirdNumber>secondNumber)) {
				temp=firstNumber;
				firstNumber=thirdNumber;
				thirdNumber=temp;
				if(thirdNumber>secondNumber) {
					temp=secondNumber;
					secondNumber=thirdNumber;
					thirdNumber=temp;
				}
				
			}
		}
		if((fourthNumber>firstNumber)&&(fourthNumber>secondNumber)&&(fourthNumber>thirdNumber)) {
			temp=firstNumber;
			firstNumber=fourthNumber;
			fourthNumber=temp;
			if((fourthNumber>thirdNumber)&&(fourthNumber>secondNumber)) {
				temp=secondNumber;
				secondNumber=fourthNumber;
				fourthNumber=temp;
				if(fourthNumber>thirdNumber) {
					temp=thirdNumber;
					thirdNumber=fourthNumber;
					fourthNumber=temp;
				}
			}
		}
		if((thirdNumber>firstNumber)&&(thirdNumber>secondNumber)) {
			temp=firstNumber;
			firstNumber=thirdNumber;
			thirdNumber=temp;
			if(thirdNumber>secondNumber) {
				temp=secondNumber;
				secondNumber=thirdNumber;
				thirdNumber=temp;
				
			}
		}
		if(secondNumber>firstNumber) {
			temp=firstNumber;
			firstNumber=secondNumber;
			secondNumber=temp;
			
		}
		
	
		System.out.println("***Descending order of tnree number****");
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		System.out.println(thirdNumber);
		System.out.println(fourthNumber);
		System.out.println("***Ascending order of tnree number****");
		temp=firstNumber;
		firstNumber=fourthNumber;
		fourthNumber=temp;
		temp=secondNumber;
		secondNumber=thirdNumber;
		thirdNumber=temp;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		System.out.println(thirdNumber);
		System.out.println(fourthNumber);
		
	}

}
