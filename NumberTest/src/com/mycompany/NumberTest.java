package com.mycompany;

import java.lang.reflect.Array;
import java.util.Scanner;

public class NumberTest {
	
	public static void main(String[] args) {
		
		int[] intArr= new int[] {1,2,3,4,5};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :: ");
		
		int n=sc.nextInt();
		for(int i=0;i<intArr.length; i++) {
			
			if( n == (int)Array.getInt(intArr, i)) {
				System.out.println("Value found");
				int x =  intArr[i];
				for(int j=x+1; j<=intArr.length; j++) {
					System.out.println(j);
				}
				for(int m=1; m<x; m++) {
					System.out.println(m);
				}
				
			}
		}
	}
}
