package com.akash;
/*
* * * * *
* * * *
* * *
* *
*
 */
public class Q15 {
	public static void main(String[] args) {
		int m = 5;
		//Nested Loop
		//Outer Loop
		for(int i = m; i >= 1; i--) {
			//Inner Loop
			for(int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
