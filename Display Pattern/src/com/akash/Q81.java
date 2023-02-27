package com.akash;
/*
    *     
   *  *   
  *    *  
 *      * 
*        *       


 */
public class Q81 {
	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i == (6 - j)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j = 2; j <= 5; j++) {
				if(i == j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
