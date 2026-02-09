package com.java.revision;

public class RevsersGivenNumber {
	public static int reverNumebr(int num) {
		int reverse = 0;
		if (num < 0)
			return -1;
		while (num > 0) {
			int last = num % 10;
			reverse = reverse * 10 + last;
			num = num / 10;

		}
		return reverse;
	}

	public static void main(String[] args) {

		int num = 549;
		System.out.println(reverNumebr(num));

	}
}

