package com.codes.striver.sheet.matrix;

public class PrintSumOfDigonalElementsOfMatrix {

	public static void main(String[] args) {
		int arr[][] = { { 3, 2, 1 }, { 5, 4, 3 }, { 8, 9, 12 } };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i==j) {
				sum += arr[i][j]+arr[j][i];
			}
		}
	}
	System.out.print(sum);
}
}
