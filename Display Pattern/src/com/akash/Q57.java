package com.akash;
/*
D 
D C 
D C B 
D C B A 
D C B 
D C 
D 
 */
public class Q57 {
	public static void main(String[] args) {
		int n = 3;
		for(int i = n; i >= 0; i--) {
			char ch = 'D';
			for(int j = n; j >= i; j--) {
				System.out.print(ch + " ");
				ch--;
			}
			System.out.println();
		}
		for(int i = 0 + 1; i <= n; i++) {
			char ch = 'D';
			for(int j = n; j >= i; j--) {
				System.out.print(ch + " ");
				ch--;
			}
			System.out.println();
		}
	}
}
