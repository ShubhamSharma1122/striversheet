package com.striver.easy.array;

public class LeftRotateArrayByOne {

	public static void rotateArray(int arr[]) {
		int n = arr.length;
		int temp[] = new int[n];

		for (int i = 1; i < n; i++) {
			temp[i - 1] = arr[i];
		}
		temp[n - 1] = arr[0];
		for (int t : temp) {
			System.out.print(t + "  ");
		}


	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		rotateArray(arr);
	}
}
