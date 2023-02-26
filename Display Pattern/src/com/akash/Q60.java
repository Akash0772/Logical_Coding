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
public class Q60 {
	public static void main(String[] args) {
		int n = 3;
		for(int i = n; i >= 1; i--) {
			for(int j = n; j >= n - i + 1; j--) {
				System.out.print("  ");
			}
			for(int j = n; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i = 0; i <= n; i++) {
			for(int j = n+1; j > n - i + 1; j--) {
				System.out.print("  ");
			}
			for(int j = n; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
