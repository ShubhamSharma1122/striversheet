package com.codes.striver.sheet.string;

public class StringDuplicates {

	public static void main(String[] args) {
		String result = "";
		String str = "progrram";
		boolean[] seen = new boolean[233];
		for (char ch : str.toCharArray()) {
			if (!seen[ch]) {
				seen[ch] = true;
				result += ch;
			}
		}
		System.out.print(result);
	}

}
