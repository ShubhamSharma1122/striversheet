package com.striver.easy.array;

public class CheckIfArrayShortedOrNot {
	public static boolean checkSorted(int arr[]) {
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 2, 30, 40, 50 };
		System.out.println(checkSorted(arr));
	}
}
