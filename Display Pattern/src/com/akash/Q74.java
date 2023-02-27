package com.akash;
/*
 A B C D E 
  A B C D 
   A B C 
    A B 
     A     
 */
public class Q74 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1; i <= n; i++) {
			char ch = 'A';
			for(int j = n; j >= n - i + 1; j--) {
				System.out.print(" ");
			}
			for(int j = n - i + 1; j >= 1; j--) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
}
