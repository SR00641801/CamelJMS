package com.mycompany;

import java.util.Scanner;

public class StringReverseCheck {

	public static void main(String[] args) {

		
       
		int flag = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :: ");
		String name = sc.nextLine();
		int k=name.length()-1;
		for (int j = 0; j < name.length(); j++) {
			  
				if (name.charAt(j) != name.charAt(k)) {
					flag = 0;
					break;
				}
				else {
					k--;
				}
			

		}
		if (flag == 1) {
			System.out.println("Mirror");
		} else
			System.out.println("NOT a Mirror");
	}
}
