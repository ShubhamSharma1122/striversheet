package com.codes.striver.sheet.string;

import java.util.Stack;

public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {
		String str = "abbaca";
		StringBuilder result = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!stack.isEmpty() && stack.peek() == ch) {
				stack.pop();
			}
			else {
				stack.push(ch);
			}
		}
		for (char ch : stack) {
			result.append(ch);
		}
		System.out.println(result);
	}
}
