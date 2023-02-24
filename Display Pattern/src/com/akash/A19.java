package com.akash;
/*
7 
6 7 
5 6 7 
4 5 6 7 
3 4 5 6 7 
2 3 4 5 6 7 
1 2 3 4 5 6 7    
 */
public class A19 {
	public static void main(String[] args) {
		for(int i = 7; i >= 1; i--) {
			for(int j = i; j <= 7; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}