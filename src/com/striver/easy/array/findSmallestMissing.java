package com.striver.easy.array;

public class findSmallestMissing {
	public static int findSmallestMissing(int arr[]) {
		int arrSum = 0;
		int n =arr.length;
		for (int i = 0; i < arr.length; i++) {
			arrSum += arr[i];
		}
		int naturalNumberSum = n * (n + 1) / 2;
		int result = naturalNumberSum - arrSum;
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, -1, 1 };
		System.out.println(findSmallestMissing(arr));
	}
}
