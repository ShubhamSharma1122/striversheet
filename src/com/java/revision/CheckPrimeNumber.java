package com.java.revision;

public class CheckPrimeNumber {
	public static Boolean checkPrimeNum(int n) {
		int number = n;

		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		int n = 15;

		System.out.println(checkPrimeNum(n));
	}
}
