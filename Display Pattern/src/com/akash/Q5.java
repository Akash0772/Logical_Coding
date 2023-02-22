package com.akash;
/*
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E
 */
public class Q5 {
	public static void main(String[] args) {
		char m = 'E';
		char n = 'E';
		//Nested Loop
		//Outer Loop
		for(char i = 'A'; i <= m; i++) {
			//Inner Loop
			for(char j = 'A'; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
