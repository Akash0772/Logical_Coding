package com.akash;
/*
3 
2 3 
1 2 3 
0 1 2 3 
1 2 3 
2 3 
3   
 */
public class Q56 {
	public static void main(String[] args) {
		int n = 3;
		for(int i = n; i >= 0; i--) {
			for(int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}