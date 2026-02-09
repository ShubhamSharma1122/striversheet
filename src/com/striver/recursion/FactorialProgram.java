package com.striver.recursion;

public class FactorialProgram {

	public static int factorial(int n) {
		if (n == 1)
			return 1;
		if (n < 1)
			return 0;

		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		int n = 5;

		System.out.println(factorial(n));
	}
}
