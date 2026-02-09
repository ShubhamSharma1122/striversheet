package com.striver.easy.array;

public class LargetElementInArray {

	public static int largestInArray(int arr[]) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}



		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 100, 102 };
		System.out.println(largestInArray(arr));
	}
}
