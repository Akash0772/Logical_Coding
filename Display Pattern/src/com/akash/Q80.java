package com.akash;
/*
    A 
   A B 
  A B C 
 A B C D 
A B C D E 
 B C D E 
  C D E 
   D E 
    E  
 */
public class Q80 {
	public static void main(String[] args) {
		int n = 5; 
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
		}
		for(int i = 2; i <= n; i++) {
			for(int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for(int j = i; j <= n; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
		}
	}
}
