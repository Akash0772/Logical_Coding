package com.akash;
/*
E D C B A
E D C B A
E D C B A
E D C B A
E D C B A
 */
public class Q9 {
	public static void main(String[] args) {
		char ch = 'E';
		//Nested Loop
		//Outer Loop
		for(char i = ch; i >= 'A'; i--) {
			//Inner Loop
			for(char j = ch; j >= 'A'; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
