package com.akash;
/*
A A A A A
B B B B
C C C
D D
E

 */
public class Q18 {
	public static void main(String[] args) {
		char n = 'E';
		//Nested Loop
		//Outer Loop
		for(char i = 'A'; i <= n; i++) {
			//Inner Loop
			for(char j = i; j <= n; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
