package com.codes.striver.sheet;

public class EasyPattern01 {
public static void main(String[] args) {
	int n=5;
	int space = 0;
	for(int i=1;i<=n;i++) {
		// space
		space = n - i;
		for (int j = 1; j <= space; j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(i + " ");
		}
		// space
		for (int k = 1; k <= space; k++) {
			System.out.print(" ");
		}
		System.out.println();
	}
}
}
