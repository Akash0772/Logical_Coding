package com.akash;
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
public class Q12 {
	public static void main(String[] args) {
		int m = 5;
		//Nested Loop
		//Outer Loop
		for(int i = 1; i <= m; i++) {
			//Inner Loop
			for(int j = 1; j <= i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
