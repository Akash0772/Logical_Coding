package com.akash;
/*
9 9 9 9 9 9 9 9 9 
  7 7 7 7 7 7 7 
    5 5 5 5 5 
      3 3 3 
        1 
 */
public class Q49 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(i * 2 - 1  + " ");
			}
			System.out.println();
		}
	}
}
