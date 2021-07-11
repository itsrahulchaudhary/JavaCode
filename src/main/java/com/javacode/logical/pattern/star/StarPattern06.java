package com.javacode.logical.pattern.star;

public class StarPattern06 {
	public static void main(String[] args) {
		/*
	      ------------------------------
	                    *
	                  * *
	                * * *
	              * * * *
			    * * * * *
		          * * * *
		            * * * 
	   	              * * 
			            * 
		  ------------------------------
	       */
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int x = 1; x <= n; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print(" ");
			}
			for (int z = n - 1; z >= x; z--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
