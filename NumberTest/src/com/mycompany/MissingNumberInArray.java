package com.mycompany;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9 };
		int n = arr.length-1;
		int missarr[] = new int[n];
		
		for (int i = 1; i < n; i++) {
			if (i != arr[i]) {
				missarr[i] = i;
			}
		}
		for (int i = 0; i < n; i++)
			System.out.println(missarr[i]);

	}

}
