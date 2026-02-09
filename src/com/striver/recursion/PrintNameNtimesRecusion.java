package com.striver.recursion;

public class PrintNameNtimesRecusion {
	public static void printName(int n, String name, int start) {

		if (start == 108) {
			return ;
		}
		System.out.println(name);
		printName(n, name, start + 1);

	}

	public static void main(String[] args) {

		int n = 108;
		String name = "OM Namah Shivay";
		printName(n, name, 0);

	}
}
