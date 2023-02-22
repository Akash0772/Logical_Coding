package com.akash;
/*
A
B B
C C C
D D D D
E E E E E
 */
public class Q13 {
	public static void main(String[] args) {
		char m = 'E';
		//Nested Loop
		//Outer Loop
		for(char i = 'A'; i <= m; i++) {
			//Inner Loop
			for(char j = 'A'; j <= i; j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}
}
