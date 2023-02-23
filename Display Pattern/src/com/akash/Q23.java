package com.akash;
/*
E D C B A
E D C B
E D C
E D
E
 */
public class Q23 {
	public static void main(String[] args) {
		for(char i = 'A'; i <= 'E'; i++) {
			for(char j = 'E'; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}