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
		//Nested Loop
		//Inner Loop
		for(int i = 0; i <= n; i++) {
			//Outer Loop
			for(int j = 1; j <= n - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
