package com.bank.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.bank.entity.Rate;
import com.bank.entity.Service;

public class BankService {

	public static Service createService() {
		
		Scanner scanner = new Scanner(System.in);
		
		/************* User Input of service details ***************/
		
		System.out.println("Enter the following details to create service");
		System.out.println("Service Code:-");
		String serviceCode = scanner.nextLine();
		System.out.println("Service Name:-");
		String serviceName = scanner.nextLine();
		System.out.println("Service Description:-");
		String serviceDesc = scanner.nextLine();
		System.out.println("Open Date:-");
		String openDate = scanner.nextLine();
		System.out.println("Validity Date:-");
		String validityDate = scanner.nextLine();
		System.out.println("Expiry Date:-");
		String expiryDate = scanner.nextLine();
		
		/************* String to Date Conversion ************/
		
		Date openDateConverted = stringToDate(openDate);
		Date validityDateConverted = stringToDate(validityDate);
		Date expiryDateConverted = stringToDate(expiryDate);

		/**************** Creation of Service Object *****************/
		Service service = new Service(serviceCode,serviceName,serviceDesc, openDateConverted,validityDateConverted,expiryDateConverted);
		return service;
	}

	public static void createRateCard(Service service) {
		
		Scanner scanner = new Scanner(System.in);
		Rate rate = new Rate();
		
		System.out.println("************** Enter the Rate Card for "+service.getServiceName()+"******************");
		System.out.println("Enter the no of tiers you want to add:");
		int noOfTiers = scanner.nextInt();
		int [] min = new int[noOfTiers];
		int [] max = new int[noOfTiers];
		double [] fees = new double[noOfTiers];
		
		for(int tier=0;tier<noOfTiers;tier++)
		{
			System.out.println("Enter the MIN MAX and Rate for the "+(tier+1)+"tier");
			min[tier]=scanner.nextInt();
			max[tier]=scanner.nextInt();
			fees[tier]=scanner.nextDouble();
			System.out.println("Successfully inserted values in the "+(tier+1)+"tier");
			if(tier<noOfTiers-1)
			{
				System.out.println("Do you want to continue adding the tiers - (y/n)");
				char ch=scanner.next().charAt(0);
				if(ch=='y')
					continue;
				else
					break;
			}
			

		}
		
		service.setRate(rate);
		service.getRate().setMax(max);//getting object of Rate for a particular service and then setting its max array
		service.getRate().setMin(min);
		service.getRate().setRate(fees);
		
		System.out.println("*********** Successfully created rate card for service "+ service.getServiceName()+" ***************");
	}

	public static void displayServiceDetails(Service service) {

		
		System.out.println("******** Service Details **********");
		System.out.println("Service Code"+" 	"+"Service Name"+" 	"+"Service Description"+" 	"+"Open Date"+" 	"+"Validity Date"+" 	"+"Expiry Date");
		System.out.println(service.getServiceCode()+" 	"+service.getServiceName()+" 	"+service.getServiceDesc()+" 	"+service.getOpenDate()+" 	"+service.getValidityDate()+" 	"+service.getExpiryDate());

		System.out.println("******* Rate Card for the service "+service.getServiceName() +" is given below");
		System.out.println("Min 	Max 	Rate");
		for(int index = 0;index<service.getRate().getMin().length;index++)
		{
			if((service.getRate().getMax()[index]<=999999)&&(service.getRate().getMax()[index]!=0))
			{
				System.out.println(service.getRate().getMin()[index]+"	"+service.getRate().getMax()[index]+"	"+service.getRate().getRate()[index]);
			}
		}
	}
	
	public static Date stringToDate(String dateString)
	{
		Date convertDate = null;
		try
		{
			convertDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return convertDate;
		
	}

}
