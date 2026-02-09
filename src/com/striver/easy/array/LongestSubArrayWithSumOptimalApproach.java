package com.striver.easy.array;

import java.util.HashMap;

public class LongestSubArrayWithSumOptimalApproach {

	public static int longestSubArrayWithSum(int arr[], int k) {
		int n = arr.length;
		HashMap<Integer, Integer> preSumMap = new HashMap<>();
		int sum = 0;
		int maxLength = 0;

		for (int i = 0; i < n; i++) {
			sum += arr[i];

			// If the sum is equal to k, update maxLength
			if (sum == k) {
				maxLength = i + 1;
			}

			// Calculate the remaining sum (sum - k)
			int rem = sum - k;

			// Check if this remaining sum has been seen before
			if (preSumMap.containsKey(rem)) {
				// Calculate the length of the subarray
				int len = i - preSumMap.get(rem);
				maxLength = Math.max(maxLength, len);
			}

			// Only add the sum to the map if it is not already present
			if (!preSumMap.containsKey(sum)) {
				preSumMap.put(sum, i);
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5 };
		int k = 5;
		System.out.println(longestSubArrayWithSum(arr, k)); // Output will be 2 (subarray [2, 3])
	}
}
