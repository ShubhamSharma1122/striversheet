package com.java.revision;

import java.util.ArrayList;
import java.util.List;

public class FindmaximumandMinimum {
	public static List<Integer> maxmin(int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		List<Integer>maxmin =  new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if (arr[i] < min) {
				min = arr[i];
		}
		else if (arr[i] > max) {
			max = arr[i];
		}

	}
		maxmin.add(max);
		maxmin.add(min);

	return maxmin;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 5, 1, 8, 2 };
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("the  max  and  minmun values  are " + maxmin(arr));

	}
}
