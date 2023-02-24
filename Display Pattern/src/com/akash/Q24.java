package com.akash;
/*
        * 
      * * 
    * * * 
  * * * * 
* * * * *
 */
public class Q24 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= (5 - i); j++) {
				System.out.print("  "); // two space
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("* "); // one space 
			}
			System.out.println();
		}
	}
}
