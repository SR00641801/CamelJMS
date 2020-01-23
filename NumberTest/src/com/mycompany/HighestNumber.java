package com.mycompany;

public class HighestNumber {
	
	public static void main(String[] args) {
		
		int arr[] = {0,73,4,23,44};

		int highest = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > highest) {
				highest = arr[i];
			}
		}
		System.out.println("Highest :: " + highest);

		for(int i=0; i<arr.length-1; i ++) {
			for(int j =0 ; j <arr.length-1;j ++ )
			if(arr[j]<arr[j+1]) {
				int swap=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=swap;
			}
		}
		System.out.println();
		System.out.println("Sorted Array");
		for (int i=0; i<arr.length; i++) {
			
            System.out.print(arr[i] + " | ");
		}
		System.out.println();
		System.out.println();
		int highestNumber = 0, secondHighestNumber= 0;
		for(int i =0; i <arr.length; i ++ ) {
			if(arr[i]>highestNumber) {
				secondHighestNumber=highestNumber;
				highestNumber=arr[i];
			}else if(arr[i]>secondHighestNumber && arr[i]!=highestNumber) {
				secondHighestNumber=arr[i];
			}
		}
		System.out.println("High :: " + highestNumber);
		System.out.println("2nd High :: " + secondHighestNumber);
	}
	
}
