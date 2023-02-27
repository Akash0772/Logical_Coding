package com.akash;
/*
    A 
   B B 
  C C C 
 D D D D 
E E E E E 
 D D D D 
  C C C 
   B B 
    A 
 */
public class Q79 {
	public static void main(String[] args) {
		int n = 5; 
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print((char) (i + 64) + " ");
			}
			System.out.println();
		}
		
		for(int i = n - 1; i >= 1; i--) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print((char) (i + 64) + " ");
			}
			System.out.println();
		}
	}
}
