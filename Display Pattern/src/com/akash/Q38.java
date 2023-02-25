package com.akash;
/*
        A 
      C C C 
    E E E E E 
  G G G G G G G 
I I I I I I I I I 
 */
public class Q38 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1, element = 1; i <= n; i++, element += 2) {
//			char ch = 'A';
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= element; j++) {
				System.out.print((char) (2 * i + 64 - 1) + " ");
			}
			System.out.println();
		}
	}
}