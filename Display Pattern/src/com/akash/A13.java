package com.akash;
/*
1 1 1 1 1 
1 0 0 0 1 
1 0 0 0 1 
1 0 0 0 1 
1 1 1 1 1     
 */
public class A13 {
	public static void main(String[] args) {
		/*

		 1st Approach

		for(int i = 1; i <= 5; i++) {
			//first Line
			if(i == 1) {
				for(int j = 1; j <= 5; j++) {
					System.out.print(1 + " ");
				}
			}
			//middle Line
			if(i > 1 && i < 5) {
				for(int j = 1; j <= 5; j++) {
					if(j == 1) {
						System.out.print(1 + " ");
					}else if(j == 5){
						System.out.print(1 + " ");
					}else {
						System.out.print(0 + " ");
					}
				}
			}
			//last line
			if(i == 5) {
				for(int j = 5; j >= 1; j--) {
					System.out.print(1 + " ");
				}
			}
			System.out.println();
		}
		
		*/
		
//		2nd Approach
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i == 1 || i == 5 || j == 1 || j == 5) {
					System.out.print(1 + " ");
				}else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
}