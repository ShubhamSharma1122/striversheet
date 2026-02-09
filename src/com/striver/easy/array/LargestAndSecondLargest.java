package com.striver.easy.array;

public class LargestAndSecondLargest {
	public static void maxAndMinElement(int arr[]) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("max  and  min  are  " + max + "       " + min);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 1, 150, 500 };
		maxAndMinElement(arr);
	}
}
