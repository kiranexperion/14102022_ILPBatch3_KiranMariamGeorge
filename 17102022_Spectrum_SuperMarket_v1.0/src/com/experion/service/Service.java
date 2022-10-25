package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
	Product productList[] = new Product[3];
	int i=0;
	
	public void stockUpdation() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the product code: ");
		String productCode = scanner.nextLine();
		
		
		System.out.println("Enter the product name: ");
		String productName = scanner.nextLine();
		 
		
		System.out.println("Enter the product description: ");
		String productDescription = scanner.nextLine();
		
		
		System.out.println("Enter the product price: ");
		double productPrice = scanner.nextDouble();
		
		System.out.println("Enter the expiryDate: ");
		String expiryDate = scanner.nextLine();
				
		
		productList[i].setProductCode(productCode); 
		productList[i].setProductName(productName);
		productList[i].setProductDescription(productDescription);
		productList[i].setProductPrice(productPrice);
		productList[i].setExpiryDate(expiryDate);
		
		i++;
		
	}
	
	

	public void stockDisplay() {

		for (int i=0;i<3;i++)
		{
			System.out.println("*******Details of Product " + i+1 +"*********");
			System.out.println("Product code: " + productList[i].getProductCode());
			System.out.println("Product name: " + productList[i].getProductName());
			System.out.println("Product Description: " + productList[i].getProductDescription());
			System.out.println("Product Price: " + productList[i].getProductPrice());
			System.out.println("Expiry Date: " + productList[i].getExpiryDate());
		}
		

	}
}
