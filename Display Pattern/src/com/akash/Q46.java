package com.akash;
/*
        A 
      A B A 
    A B C B A 
  A B C D C B A 
A B C D E D C B A      
 */
public class Q46 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			for(int j = i - 1; j >= 1; j--) {
				System.out.print((char) (j + 64)  + " ");
			}
			System.out.println();
		}
	}
}