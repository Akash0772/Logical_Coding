package com.akash;
/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */
public class Q11 {
	public static void main(String[] args) {
		int m = 5;
		//Nested Loop
		//Outer Loop
		for(int i = 1; i <= m; i++) {
			//Inner Loop
			for(int j = 1; j <= i; j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}
}
