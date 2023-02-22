package com.akash;
/*
E E E E E
D D D D D
C C C C C
B B B B B
A A A A A
 */
public class Q8 {
	public static void main(String[] args) {
		char ch = 'E';
		//Nested Loop
		//Outer Loop
		for(char i = ch; i >= 'A'; i--) {
			//Inner Loop
			for(char j = ch; j >= 'A'; j--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
