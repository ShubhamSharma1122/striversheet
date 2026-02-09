package com.java.revision;

public class CountDigitsInNumber {
  public static int countDigits(int  num) {
		int digitCount = 0;
		while (num > 0) {
			digitCount++;
			num = num / 10;
		}
		return digitCount;
  } 
	public static void main(String[] args) {
		System.out.println(countDigits(321222219));
		
}
}
