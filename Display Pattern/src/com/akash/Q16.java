package com.akash;
/*
1 1 1 1 1
2 2 2 2
3 3 3
4 4
5
 */
public class Q16 {
	public static void main(String[] args) {
		int n = 5;
		//Nested Loop
		//Outer Loop
		for(int i = 1; i <= n; i++) {
			//Inner Loop
			for(int j = i; j <= 5; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
