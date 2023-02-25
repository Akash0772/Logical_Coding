package com.akash;
/*
A B C D E 
  A B C D 
    A B C 
      A B 
        A   
 */
public class Q33 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = n; i >= 1; i--) {
			char ch = 'A';
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
}