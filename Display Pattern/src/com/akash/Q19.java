package com.akash;
/*
A B C D E
A B C D
A B C
A B
A

 */
public class Q19 {
	public static void main(String[] args) {
		char n = 'E';
		//Nested Loop
		//Outer Loop
		for(char i = n; i >= 'A'; i--) {
			//Inner Loop
			for(char j = 'A'; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
