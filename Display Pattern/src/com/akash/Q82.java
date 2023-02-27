package com.akash;
/*
    1     
   2  2   
  3    3  
 4      4 
5        5      


 */
public class Q82 {
	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i == (6 - j)) {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}
			for(int j = 2; j <= 5; j++) {
				if(i == j) {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
