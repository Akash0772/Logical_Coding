package com.akash;
/*
        A 
      A B C 
    A B C D E 
  A B C D E F G 
A B C D E F G H I    
 */
public class Q41 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1, element = 1; i <= n; i++, element += 2) {
			char ch = 'A';
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for(int j = element; j >= 1; j--) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
}