package com.akash;
/*
 5 4 3 2 1 
  4 3 2 1 
   3 2 1 
    2 1 
     1    
 */
public class Q71 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= n - i + 1; j--) {
				System.out.print(" ");
			}
			for(int j = n - i + 1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
