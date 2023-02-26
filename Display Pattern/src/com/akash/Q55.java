package com.akash;
/*
3 
3 2 
3 2 1 
3 2 1 0 
3 2 1 
3 2 
3 
 */
public class Q55 {
	public static void main(String[] args) {
		int n = 3;
		for(int i = n; i >= 0; i--) {
			for(int j = n; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i = 0 + 1; i <= n; i++) {
			for(int j = n; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
