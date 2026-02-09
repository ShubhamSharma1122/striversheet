package com.striver.easy.array;

public class ReplaceAllZerosWithFive {
	public static void replaceZero(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = 5;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 0, 1, 7, 0 };
		replaceZero(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
