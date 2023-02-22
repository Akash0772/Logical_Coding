package com.akash;
/*
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
 */
public class Q3 {
	public static void main(String[] args) {
		int n = 5;
		int m = 5;
		//Nested Loop
		//Outer Loop
		for(int i = 1; i <= n; i++) {
			//inner Loop
			for(int j = 1; j <= m; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
