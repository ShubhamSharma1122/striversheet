package com.striver.easy.array;

import java.util.HashSet;

public class RemoveDuplicatesFromeSortedArray {
	public static   void  removeDuplicate(int arr[]) {

		HashSet<Integer> seen = new HashSet<>();
		int index = 0;
		for (int n : arr) {
			if (!seen.contains(n)) {
				seen.add(n);
				index++;
			}
		}
		for(Integer i :seen) {
System.out.print(i+ " ");
	}
}
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 10, 50 };
		removeDuplicate(arr);
	}
}
