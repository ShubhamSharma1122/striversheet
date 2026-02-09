package com.java.revision;

public class Print1ToNusingRecusrion {

	public static void printRecursive(int n,int target ) {
		
		if(n==target) {
			return;
		}
		System.out.println(n);
		printRecursive(n+1, target);
	}

	public static void main(String[] args) {
		int n = 1;
		int target = 210;
		printRecursive(n, target);
	}
}
