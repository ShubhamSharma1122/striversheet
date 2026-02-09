package com.hashing;

public class highestAndLoswestFrequency {

	public static void highestLowestFreq(int arr[]) {
		boolean[] visited = new boolean[arr.length];
		int maxFreq = 0;
		int minFreq = arr.length;
		int maxElement = 0;
		int minElement = 0;

		for (int i = 0; i < arr.length; i++) {
			if (visited[i])
				continue;

			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}

			}

			if (count > maxFreq) {
				maxFreq = count;
				maxElement = arr[i];
			}
			if (count < minFreq) {
				minFreq = count;
				minElement = arr[i];
			}
		}
		System.out.println("the maximun  element  with  frequency " + maxElement + " " + maxFreq);

		System.out.println("the minimum  element  with  minimum frequency " + minElement + " " + minFreq);

	}

	public static void main(String[] args) {
		int arr[] = { 10, 5, 10, 15, 10, 5 };
		highestLowestFreq(arr);
	}
}
