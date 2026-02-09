package com.striver.easy.array;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 5, 1, 2, 5 };
		RemoveDuplicatesFromArray obj = new RemoveDuplicatesFromArray();

		int[] result = obj.removeDuplicates(arr);

		for (int x : result) {
			System.out.print(x + " ");
		}
	}

	public int[] removeDuplicates(int arr[]) {

		int[] temp = new int[arr.length];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			// compare with already stored unique elements
			for (int j = 0; j < index; j++) {
				if (arr[i] == temp[j]) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				temp[index++] = arr[i];
			}
		}

		int[] answer = new int[index];
		for (int i = 0; i < index; i++) {
			answer[i] = temp[i];
		}

		return answer;
	}
}
