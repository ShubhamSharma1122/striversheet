package com.striver.easy.array;

public class MoveZerosToEnd {
	public static void moveAllZeros(int arr[]) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[index++] = arr[i];
		}
	}
		while (index < arr.length) {
			arr[index++] = 0;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 1, 0, 2, 1 };
		moveAllZeros(arr);
		for (int i : arr) {
			System.out.print(i + " ");
	}

	}

}
