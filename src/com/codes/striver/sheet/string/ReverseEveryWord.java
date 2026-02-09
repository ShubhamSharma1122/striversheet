package com.codes.striver.sheet.string;

public class ReverseEveryWord {

	public static StringBuilder reverseStringWord(String str) {
   
		StringBuilder answer= new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			answer.append(str.charAt(i));
    	
    }
	return answer;
	}

	public static void main(String[] args) {
		String str = "avaj emocllew avaj";
		System.out.print(reverseStringWord(str));

	}
}
