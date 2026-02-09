package com.striver.easy.array;

import java.util.ArrayList;
import java.util.List;

public class NegativePositiveAlternative {
	public static void negativePositiveAlternative(int arr[]) {
		List<Integer> negative = new ArrayList<>();
		List<Integer> positive = new ArrayList<>();
		int left = 0;
		int right = arr.length;
		int index =0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				negative.add(arr[i]);
			}
			if (arr[i] > 0) {
				positive.add(arr[i]);
			}
		}

		int i = 0, p = 0, n = 0;
		while (n < negative.size() && p < positive.size()) {
			arr[i++] = negative.get(n++);
			arr[i++] = positive.get(p++);

		}
		if (n < negative.size()) {
			arr[i++] = negative.get(n++);
		}
		if (p < positive.size()) {
			arr[i++] = positive.get(p++);
		}

	}

	public static void main(String[] args) {

		int arr[] = { -5, -3, -2, 2, 5, 2 };

		negativePositiveAlternative(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
