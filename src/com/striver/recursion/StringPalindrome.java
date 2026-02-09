package com.striver.recursion;

public class StringPalindrome {
	public static Boolean stringPalindrome(String str) {
		int left = 0, right = str.length() - 1;
			while (left <= right) {
				if (!Character.isLetterOrDigit(str.charAt(left)))
					left++;
				else if (!Character.isLetterOrDigit(str.charAt(right)))
				 right--;	

				else if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right)))
		                return false;
				else {
					left++;
					right--;
				}
			}

			return true;
	}

	public static void main(String[] args) {
		String str = "midam";

		System.out.println(stringPalindrome(str));
	}
}
