package com.java.revision;

public class PalindromNumber {

	public static Boolean checkNumberPalindrom(int number) {
		int original =number;
		int reverse = 0;
		while(number>0) {
			int lastDegit = number%10;
			reverse  =  reverse*10+lastDegit;
			original = original / 10;
		}

		
		return original == reverse;
	}

	public static void main(String[] args) {
		int number = 121;
		if (checkNumberPalindrom(number)) {
			System.out.println("yes  this  number  is  palindrome");
		} else {
			System.out.println("not an  palindrome");
		}
	}
}
