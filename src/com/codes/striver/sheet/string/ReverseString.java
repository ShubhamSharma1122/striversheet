package com.codes.striver.sheet.string;

public class ReverseString {
	public static void main(String[] args) {
		String str = "hello";
		char[] arr = str.toCharArray();
		int left =0;
		int right =arr.length-1;
		while (left < right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

		String revers = "";
		for(int i =str.length()-1; i>=0;i--) {
			revers += str.charAt(i);
		}

		System.out.println(arr);
		System.out.println("using  for loop" + " " + revers);
	}
}
