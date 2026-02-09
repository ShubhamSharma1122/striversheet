package com.striver.easy.array;

public class LinearSearch {

	public static int indexOfTarget(int data[], int target) {

		for (int i = 0; i < data.length; i++) {
			if (data[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int data[] = { 3, 10, 4, 1, 5 };
		int target = 4;
		System.out.print(indexOfTarget(data, target));
	}

}
