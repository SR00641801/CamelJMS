package com.mycompany;

import java.util.Scanner;

public class StringNameReform {
	
	public static void main(String[] args) {
		char[] chars;
		
		String myString;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :: ");
		myString = sc.nextLine();
		String[] arr=myString.split(" ");
		char c=arr[0].charAt(0);
		myString=myString.replace(arr[0]+" ",c+".");
		
		System.out.println(myString);
		
		
	}
}
