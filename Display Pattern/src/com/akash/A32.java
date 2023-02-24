package com.akash;
/*
ABCDEFGH
ABCDEFGH
ABCDEFGH
ABCDEFGH
ABCDEFGH
ABCDEFGH
ABCDEFGH
ABCDEFGH
 */
public class A32 {
	public static void main(String[] args) {
		for(int i = 1; i <= 8; i++) {
			char ch = 'A';
			for(int j = 1; j <= 8; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
