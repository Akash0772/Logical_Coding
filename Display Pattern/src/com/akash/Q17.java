package com.akash;
/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
public class Q17 {
	public static void main(String[] args) {
		int n = 5;
		int m = 6;
		//Nested Loop
		//Outer Loop
		for(int i = 1; i <= n; i++) {
			//Inner Loop
			for(int j = 1; j <= m - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
