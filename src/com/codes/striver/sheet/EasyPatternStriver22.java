package com.codes.striver.sheet;

public class EasyPatternStriver22 {

	public static void main(String[] args) {
		int  n =4;

		for (int i = 0; i <= 2 * n - 2; i++) {
			for (int j = 0; j <= 2 * n - 2; j++) {
				int top = i;
				int right = j;
				int left = (2 * n - 2) - j;
				int botum = (2 * n - 2) - i;
				int min = n - Math.min(Math.min(top, botum), Math.min(left, right));
				System.out.print(min);
			}
			System.out.println();
		}
	
	}
}
