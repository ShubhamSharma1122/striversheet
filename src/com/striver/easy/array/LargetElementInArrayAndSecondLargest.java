package com.striver.easy.array;

public class LargetElementInArrayAndSecondLargest {

	public static void largestInArray(int arr[]) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];

			}
			if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}

		}
		System.out.print("first largest " + max + "second largest element " + secondMax);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 100, 102 };
		largestInArray(arr);
	}
}
