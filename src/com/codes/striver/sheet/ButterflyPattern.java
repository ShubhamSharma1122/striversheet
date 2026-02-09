package com.codes.striver.sheet;

public class ButterflyPattern {
	public static void main(String[] args) {
		int n = 4;
		int spaces = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			spaces = 2 * (n - 1);
			for (int k = 1; k <= spaces; k++) {
				System.out.print(" ");
			}
			for (int g = 1; g <= i; g++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			spaces = 2 * (n - 1);
			for (int k = 1; k <= spaces; k++) {
				System.out.print(" ");
			}
			for (int g = 1; g <= i; g++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
