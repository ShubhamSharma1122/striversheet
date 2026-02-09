package com.striver.recursion;

public class FabonacciSeries {
//	public static int fabonacci(int n) {
//		if (n <= 1)
//			return 1;
//		int last = fabonacci(n - 1);
//		int slast = fabonacci(n - 2);
//		return last + slast;
//	}

	public static void main(String[] args) {

		int n = 5;
		int f = 0;
		int s = 1;
		int t;
		System.out.print(f + " " + s + " ");
		for (int i = 2; i <= 10; i++) {
			t = f + s;
		   
			System.out.print(t + " ");
			f = s;
			s = t;

		}
	}
}
