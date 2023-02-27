package com.akash;
/*
          
*        *
 *      * 
  *    *  
   *  *   
    *        


 */
public class Q86 {
	public static void main(String[] args) {
		for(int i = 6; i >= 1; i--) {
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
