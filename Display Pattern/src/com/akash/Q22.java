package com.akash;
/*
E E E E E
D D D D
C C C
B B
A
 */
public class Q22 {
	public static void main(String[] args) {
		for(char i = 'E'; i >= 'A'; i--) {
			for(char j = i; j >= 'A'; j--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}