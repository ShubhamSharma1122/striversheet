package com.striver.easy.array;

public class MoveAllNegativeToBeginning {
	public static void moveAllNegativeToBeginning(int values[]) {
      int left =0;
		int temp = 0;
      int right  =values.length-1;

		while (left < right) {
			if (values[left] < 0) {
				left++;
			} else if (values[right] >= 0) {
				right--;
			} else {
				temp = values[left];
				values[left] = values[right];
				values[right] = temp;
				left++;
				right--;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, -9, 8, -1 };
		moveAllNegativeToBeginning(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
