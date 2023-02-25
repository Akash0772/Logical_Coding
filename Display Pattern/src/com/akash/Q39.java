package com.akash;
/*
        1 
      1 2 3 
    1 2 3 4 5 
  1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 9  
 */
public class Q39 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1, element = 1; i <= n; i++, element += 2) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= element; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}