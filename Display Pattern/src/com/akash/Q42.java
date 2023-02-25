package com.akash;
/*
        A 
      C B A 
    E D C B A 
  G F E D C B A 
I H G F E D C B A     
 */
public class Q42 {
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1, element = 1; i <= n; i++, element += 2) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for(int j = element; j >= 1; j--) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
		}
	}
}