package com.akash;
/*
A A A A A
B B B B B
C C C C C
D D D D D
E E E E E
 */
public class Q4 {
	public static void main(String[] args) {
		char m = 'E';
		char n = 'E';
		//Nested Loop
		//Outer Loop
		for(char i = 'A'; i <= m; i++) {
			//inner Loop
			for(char j = 'A'; j <= n; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
