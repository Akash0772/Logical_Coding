package com.akash;
/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
2 3 4 5 
3 4 5 
4 5 
5  
 */
public class Q77 {
	public static void main(String[] args) {
		int n = 5; 
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for(int i = 2; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
