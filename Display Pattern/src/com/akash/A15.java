package com.akash;
/*
0 
0 0 
0 0 0 
0 0 0 0 
0 0 0 0 0 
0 0 0 0 0 0 
0 0 0 0 0 0 0
 */
public class A15 {
	public static void main(String[] args) {
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
	}
}
