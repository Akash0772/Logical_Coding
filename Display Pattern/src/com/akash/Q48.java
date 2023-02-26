package com.akash;
/*
5 5 5 5 5 5 5 5 5 
  4 4 4 4 4 4 4 
    3 3 3 3 3 
      2 2 2 
        1
 */
public class Q48 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i + i - 1; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
