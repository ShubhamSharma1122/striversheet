package com.java.revision;


public class GcdOrHcf {
	public static int findGcdOrHcf(int a, int b) {
		while (a > 0 && b > 0) {
			if (a > b) {
				a = a % b;
			} else if (b > a) {
				b = b % a;
			}
			if (a == 0) {
				return b;
			}
			
		}
		return a;
	}

	public static void main(String[] args) {
		int a = 20;
		int b = 15;
		System.out.println(findGcdOrHcf(a, b));
		  
	}
}
