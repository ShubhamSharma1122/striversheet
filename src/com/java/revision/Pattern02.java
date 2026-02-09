package com.java.revision;

public class Pattern02 {
  public static void  pattern(int n) {
	 
	  for(int i=1;i<n*2-1;i++) {
		  for(int j=1;j<n*2-1;j++) {
		  if(i==1&&j==1&&i<=n*2&&j<=n*2) {
			  System.out.println(n+"");
		  }
		  else {
			  
		  }
		  
		  }
	  }
	  
  }
	public static void main(String[] args) {
		int n =4;
		pattern(n);
	}
}
