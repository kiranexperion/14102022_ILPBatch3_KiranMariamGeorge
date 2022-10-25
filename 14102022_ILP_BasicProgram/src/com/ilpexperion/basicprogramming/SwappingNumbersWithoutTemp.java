package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SwappingNumbersWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numbers: ");
		System.out.println("a = ");
		a=scanner.nextInt();
		System.out.println("b = ");
		b=scanner.nextInt();
		System.out.println("Numbers before swapping: a=" + a + " b=" + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers after swapping: a=" + a + " b=" + b);

	}

}
