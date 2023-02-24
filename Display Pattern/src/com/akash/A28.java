package com.akash;
/*
1 
1 1 
1 1 1 
1 1 1 1 
1 1 1 1 1 
1 1 1 1 1 1 
1 1 1 1 1 1 1 
1 1 1 1 1 1 
1 1 1 1 1 
1 1 1 1 
1 1 1 
1 1 
1     
 */
public class A28 {
	public static void main(String[] args) {
		/*
		 
		 1st Approach
		
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("1 ");
			}
			System.out.println();
		}
		for(int i = 6; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print("1 ");
			}
			System.out.println();
		}
		*/
		
//		2nd Approach
		int rows = 13;
		int firstPattern = (rows / 2) + 1;
		for(int i = 1; i <= rows; i++) {
			
			if(i <= firstPattern) {
				for(int j = 1; j <= i; j++) {
					System.out.print("1 ");
				}
			}else {
				for(int j = 1; j <= (rows + 1 - i); j++) {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}
}