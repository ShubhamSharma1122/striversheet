package com.hashing;

public class FrequencyOfArrayElement {

	public static void arrayFrequency(int arr[]) {
		boolean[] visited = new boolean[arr.length];
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
			System.out.println(arr[i] + "   " + count);
		}
	}
	public static void main(String[] args) {
		int arr[] = { 10, 20, 10, 50, 20 };
		arrayFrequency(arr);
	}
}
