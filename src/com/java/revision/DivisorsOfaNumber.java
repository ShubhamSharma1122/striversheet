package com.java.revision;

public class DivisorsOfaNumber {

	public static int countofDevisors(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}

	public static int[] divisiory(int n) {

		int size = countofDevisors(n);
		int index = 0;
		int arr[] = new int[size];
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				arr[index++] = i;

			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int n = 10;
		int answer[] = divisiory(n);
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

	}
}
