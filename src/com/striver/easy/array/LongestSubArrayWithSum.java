package com.striver.easy.array;

public class LongestSubArrayWithSum {

	public static int longestSubArrayForTheSum(int n, int target, int arr[]) {

		int len = 0;
		for (int i = 0; i <= n - 1; i++) {
			int sum = 0;
			for (int j = i; j <= n - 1; j++) {
				for (int index = i; index <= j; index++) {
					sum += arr[index];

					if (sum == target) {
						len = Math.min(n, j - i + i);
					}
			}
		}
	}	
	return len;
	}

	public static void main(String[] args) {
		int n = 3;
		int target = 5;
		int arr[] = { 2, 3, 5 };
		System.out.println(longestSubArrayForTheSum(n, target, arr));


	}
}
