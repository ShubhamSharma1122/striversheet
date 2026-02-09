package com.striver.shorting;

public class SelectionShort {

	public static void selectionShort(int arr[]) {
		int minindex;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			minindex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minindex]) {
					minindex = j;
				}
			}
			temp = arr[minindex];
			arr[minindex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 44, 55, 11, 41, 2 };
		selectionShort(arr);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
