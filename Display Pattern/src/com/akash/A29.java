package com.akash;
/*
                  1 
                1 1 
              1 1 1 
            1 1 1 1 
          1 1 1 1 1 
        1 1 1 1 1 1 
      1 1 1 1 1 1 1 
    1 1 1 1 1 1 1 1 
  1 1 1 1 1 1 1 1 1 
1 1 1 1 1 1 1 1 1 1 
  1 1 1 1 1 1 1 1 1 
    1 1 1 1 1 1 1 1 
      1 1 1 1 1 1 1 
        1 1 1 1 1 1 
          1 1 1 1 1 
            1 1 1 1 
              1 1 1 
                1 1 
                  1 
 */
public class A29 {
	public static void main(String[] args) {
		int row = 19;
		int col = 10;
		int upperPattern = (row / 2) + 1;
		int lowerPattern = row - upperPattern;
		
		for(int i = 1; i <= row; i++) {
			if(i <= upperPattern) {
				for(int j = 1; j <= (col - i); j++) {
					System.out.print("  ");
				}
				for(int j = 1; j <= i; j++) {
					System.out.print("1 ");
				}
			}else {
				for(int j = 1; j <= (i - col); j++) {
					System.out.print("  ");
				}
				for(int j = 1; j <= (row + 1 - i); j++) {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}
}
