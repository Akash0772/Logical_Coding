package com.akash;
/*
A
AB
ABC
ABCD
ABCDE
ABCDEF
ABCDEFG
ABCDEFGH
 */
public class A33 {
	public static void main(String[] args) {
		for(int i = 1; i <= 8; i++) {
			char ch = 'A';
			for(int j = 1; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
