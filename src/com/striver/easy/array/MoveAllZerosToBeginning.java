package com.striver.easy.array;

public class MoveAllZerosToBeginning {
	public static void moveZeroTwoBeginning(int arr[])
	{
		int temp = 0;
		int left =0;
		int right = arr.length - 1;
		while (left < right) {
			if (arr[left] == 0) {
				left++;

			} else if (arr[right] != 0) {
				right--;
			}

			else if (arr[right] == 0) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				right--;
				left++;
			}
		}
		
	}
	public static void main(String[] args) {
		int arr[] = { 9, 4, 0, 2, 1 };
		moveZeroTwoBeginning(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
