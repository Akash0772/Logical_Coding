package com.akash;
/*
*
* *
* * *
* * * *
* * * * *
 */
public class Q10 {
	public static void main(String[] args) {
		int m = 5;
		//Nested Loop
		//Outer Loop
		for(int i = 1; i <= m; i++) {
			//Inner Loop
			for(int j = 1; j <= i; j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}
}
