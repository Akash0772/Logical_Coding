package com.akash;
/*
        1 
      3 3 3 
    5 5 5 5 5 
  7 7 7 7 7 7 7 
9 9 9 9 9 9 9 9 9
 */
public class Q36 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1, element = 1; i <= n; i++, element +=2) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= element; j++) {
				System.out.print(i * 2 - 1 + " ");
			}
			System.out.println();
		}
	}
}