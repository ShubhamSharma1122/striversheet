package com.codes.striver.sheet.string;

public class CheckForPalindrome {
public static void main(String[] args) {
	
	String str  ="tiit";
	int s=0;
	int end =str.length();
	while(s<end) {
		if(str.charAt(s)==str.charAt(end)) {
			s++;
			end--;
			if(s==end) {
				System.out.print("yes it is");
			}
		}
		else {
			System.out.println("not at all");
		}
	}
}
}
