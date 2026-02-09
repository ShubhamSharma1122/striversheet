package com.striver.recursion;

public class ReverseAnArray {

	public static void reverArray(int arr[], int left, int right) {

		int index = 0;
		if (left >= right) {
			return;
		}
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;

		reverArray(arr, left + 1, right - 1);

	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };

		reverArray(arr, 0, arr.length - 1);
		for (int x : arr) {
			System.out.print(x + " ");
		}

	}
}
