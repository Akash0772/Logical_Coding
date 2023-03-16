package com.akash;
/*
      D 
    C D 
  B C D 
A B C D 
  B C D 
    C D 
      D    
 */
public class Q62 {
	public static void main(String[] args) {
		int n = 4;
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for(int j = i; j <= n; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
		}
		for(int i = 2; i <= n; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for(int j = i; j <= n; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
		}
	}
}