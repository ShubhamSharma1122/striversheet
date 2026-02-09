package com.java.revision;


public class BacktrackingPrint1ToN {
	public static void print1ToN(int current, int target) {
		if (current > target) {
			return;
		}


		print1ToN(current + 1, target);
		System.out.println(target);


	}

	public static void main(String[] args) {
		int target = 208;
		int current = 1;
		print1ToN(current, target);

	}
}
