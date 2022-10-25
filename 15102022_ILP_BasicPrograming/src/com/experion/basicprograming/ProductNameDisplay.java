package com.experion.basicprograming;

import java.util.Scanner;

public class ProductNameDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String productNames[]= new String [5];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first product name: ");
		productNames[0]=scanner.nextLine();
		System.out.println("Enter second product name: ");
		productNames[1]=scanner.nextLine();
		System.out.println("Enter third product name: ");
		productNames[2]=scanner.nextLine();
		System.out.println("Enter fourth product name: ");
		productNames[3]=scanner.nextLine();
		System.out.println("Enter fifth product name: ");
		productNames[4]=scanner.nextLine();
		
		System.out.println("******Product Names*******");
//		System.out.println(productNames);
		System.out.println(productNames[0]);
		System.out.println(productNames[1]);
		System.out.println(productNames[2]);
		System.out.println(productNames[3]);
		System.out.println(productNames[4]);
		

	}

}
