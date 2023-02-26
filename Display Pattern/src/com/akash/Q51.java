package com.akash;
/*
E E E E E E E E E 
  D D D D D D D 
    C C C C C 
      B B B 
        A 
 */
public class Q51 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i * 2 - 1; j++) {
				System.out.print((char) (i + 64) + " ");
				
			}
			System.out.println();
		}
	}
}
