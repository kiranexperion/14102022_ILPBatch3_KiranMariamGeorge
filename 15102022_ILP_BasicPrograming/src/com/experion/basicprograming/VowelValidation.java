package com.experion.basicprograming;

import java.util.Scanner;

public class VowelValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input a character and check whether it is a vowel or not.
		
		char isVowel;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the character: ");
		isVowel=scanner.next().charAt(0);

		switch(isVowel)
		{
		case 'a': System.out.println(isVowel+" is a vowel");
		break;
		case 'A': System.out.println(isVowel+" is a vowel");
		break;
		case 'e': System.out.println(isVowel+" is a vowel");
		break;
		case 'E': System.out.println(isVowel+" is a vowel");
		break;
		case 'i': System.out.println(isVowel+" is a vowel");
		break;
		case 'I': System.out.println(isVowel+" is a vowel");
		break;
		case 'o': System.out.println(isVowel+" is a vowel");
		break;
		case 'O': System.out.println(isVowel+" is a vowel");
		break;
		case 'u': System.out.println(isVowel+" is a vowel");
		break;
		case 'U': System.out.println(isVowel+" is a vowel");
		break;
		default: System.out.println(isVowel+" is not a vowel");
		
//		case 'a':
//		case 'A':
//		case 'e':
//		case 'E':
//		case 'i':
//		case 'I':
//		case 'o':
//		case 'O':
//		case 'u':
//		case 'U':System.out.println("vowel");
//		break;
//		default: System.out.println("not vowel");
		}
		
	}

}
