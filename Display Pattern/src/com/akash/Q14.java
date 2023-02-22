package com.akash;
/*
A
A B
A B C
A B C D
A B D C E
 */
public class Q14 {
	public static void main(String[] args) {
		char m = 'E';
		//Nested Loop
		//Outer Loop
		for(char i = 'A'; i <= m; i++) {
			//Inner Loop
			for(char j = 'A'; j <= i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
