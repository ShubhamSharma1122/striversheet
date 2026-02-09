package com.java.revision;

import java.util.Scanner;

public class Pattern01 {
     public static  void Pattern(int n) {
    	 int  num= 1;
    	 for(int i=1;i<n;i++) {
    		 for(int j=1;j<=i;j++) {
    			 System.out.print(num+"");
    			num=num+1;
    		 }
    	 System.out.println("");
    	 }
    	 
     }
	public static void main(String[] args) {
	Scanner  sc  =  new Scanner(System.in);
	int n = sc.nextInt();
	     Pattern(n);
	}
}
