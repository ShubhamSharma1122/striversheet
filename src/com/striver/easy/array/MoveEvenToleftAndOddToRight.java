package com.striver.easy.array;


public class MoveEvenToleftAndOddToRight {

	public static void moveEvenToLeftAndOddToRight(int arr[]) {

		int right = arr.length - 1;
		int left = 0;
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				result[left++] = arr[i];

			} else {
				result[right--] = arr[i];
			}

		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = result[i];
		}
	}

	public static void main(String[] args) {

		int arr[] = { 5, 8, 1, 2, 7, 4 };
		moveEvenToLeftAndOddToRight(arr);
		for (int i : arr) {
			System.out.println(i + " ");
		}
	}
}
