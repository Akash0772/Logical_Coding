package com.akash;
/*
        A 
      B B B 
    C C C C C 
  D D D D D D D 
E E E E E E E E E
 */
public class Q37 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1, element = 1; i <= n; i++, element += 2) {
//			char ch = 'A';
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= element; j++) {
				System.out.print((char) (i + 64) + " ");
//				ch++;
			}
			System.out.println();
		}
	}
}