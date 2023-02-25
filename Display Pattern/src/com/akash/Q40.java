package com.akash;
/*
        1 
      3 2 1 
    5 4 3 2 1 
  7 6 5 4 3 2 1 
9 8 7 6 5 4 3 2 1   
 */
public class Q40 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1, element = 1; i <= n; i++, element += 2) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for(int j = element; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}