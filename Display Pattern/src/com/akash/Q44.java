package com.akash;
/*
        A 
      B A B 
    C B A B C 
  D C B A B C D 
E D C B A B C D E     
 */
public class Q44 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for(int j = i; j >= 1; j--) {
				System.out.print((char) (j + 64) + " ");
			}
			for(int j = 2; j <= i; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
		}
	}
}