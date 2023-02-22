package com.akash;
/*
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
 */
public class Q7 {
	public static void main(String[] args) {
		int m = 5;
		int n = 5;
		//Nested Loop
		//Outer Loop
		for(int i = m; i >= 1; i--) {
			for(int j = n; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
