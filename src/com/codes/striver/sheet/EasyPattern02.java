package com.codes.striver.sheet;

public class EasyPattern02 {
	public static void main(String[] args) {

		int n = 5;
		int space = 0;
		int count = 2;
		for (int i = 1; i <= n; i++) {
			// space
			space = n - 1;
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			//digit
			for (int l = i; l <= 1; l--) {
				System.out.print(l);
			}
			//second digit

			for (int k = 2; k <= i; k++) {

				System.out.print(k);
				count++;
			}
			System.out.println();
		}
	}
}
