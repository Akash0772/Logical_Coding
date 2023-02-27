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
public class Q63 {
	
	public static void main(String[] args) {
		int n = 3;
		for(int i = n; i >= 1; i--) {
			char ch = 'D';
			for(int j = n; j >= n - i + 1; j--) {
				System.out.print("  ");
			}
			for(int j = n; j >= i; j--) {
				System.out.print(ch + " ");
				ch--;
			}
			System.out.println();
		}
		for(int i = 0; i <= n; i++) {
			char ch = 'D';
			for(int j = n+1; j > n - i + 1; j--) {
				System.out.print("  ");
			}
			for(int j = n; j >= i; j--) {
				System.out.print(ch + " ");
				ch--;
			}
			System.out.println();
		}
	}
}
