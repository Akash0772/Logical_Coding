package com.akash;
/*
      * 
    * * 
  * * * 
* * * * 
  * * * 
    * * 
      * 
 */
public class Q59 {
	public static void main(String[] args) {
		int n = 3;
		for(int i = n; i >= 0; i--) {
			for(int j = n; j >= n - i + 1; j--) {
				System.out.print("  ");
			}
			for(int j = n; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 0; i <= n; i++) {
			for(int j = n+1; j >= n - i + 1; j--) {
				System.out.print("  ");
			}
			for(int j = n-1; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
