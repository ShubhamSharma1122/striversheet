package com.codes.striver.sheet;

public class EasyPattern {
	public static void main(String[] args) {
		int n = 5;
		for (int i = n; i >= 1; i--) {
			// spaces
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(" ");
			}
			// stars
			for (int k = n; k >= 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
