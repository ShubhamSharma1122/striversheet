package com.java.revision;

public class PrintingNto1 {

	public static void nToOne(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		nToOne(n - 1);
	}

	// backtracking
	public static void backTracking(int n) {
		if (n < 1) {
			return;
		}
		backTracking(n - 1);
		System.out.println(n);

	}
	public static void main(String[] args) {

		int n = 108;
		nToOne(n);
		System.out.println("**************************************");

		backTracking(n);
	}
}
