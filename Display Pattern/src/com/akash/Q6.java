package com.akash;
/*
5 5 5 5 5
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1
 */
public class Q6 {
	public static void main(String[] args) {
		int m = 5;
		int n = 5;
		//Nested Loop
		//Outer Loop
		for(int i = m; i >= 1; i--) {
			for(int j = 1; j <= n; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
