package com.striver.easy.array;

public class MoveAllElementXtoEnd {

	public static void movexToEnd(int arr[], int x) {
		int right = arr.length - 1;
		int temp = 0;
		int left = 0;
		int targetCount = 0;
		while (left < right) {
			if (arr[left] != x && arr[right] == x) {
				right--;
			}
			if (arr[left] == x) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				right--;
			}
			left++;
		}
		}


	public static void main(String[] args) {
		int arr[] = { 3, 4, 2, 2, 6 };
		int x = 6;
		movexToEnd(arr, x);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
