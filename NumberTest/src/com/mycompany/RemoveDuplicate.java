package com.mycompany;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50, 50 };

		int copyofArr[] = new int[arr.length - 1];
		int j = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j1 = 0; j1 < arr.length - 1; j1++) {
				if (arr[j1] > arr[j1 + 1]) {
					int swap = arr[j1 + 1];
					arr[j1 + 1] = arr[j1];
					arr[j1] = swap;
				}
			}
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				copyofArr[j++] = arr[i];
			}
		}
		copyofArr[j++] = arr[arr.length - 1];

		for (int j1 = 0; j1 < j; j1++) {
			System.out.print(copyofArr[j1] + " | ");
		}
	}
}
