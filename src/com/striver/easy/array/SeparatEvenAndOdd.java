package com.striver.easy.array;

public class SeparatEvenAndOdd {
	public static void oddLeftEvenRight(int arr[]) {
		int oddCount=0;
		int evenCount=0;
		int left = 0;
		int temp = 0;
		int right = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				temp = arr[i];
				arr[right--] = temp;
				arr[left++] = arr[right];
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 8, 12, 5, 7, 31 };
		oddLeftEvenRight(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
