package com.akash;
/*
         
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
  1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
    1 1 1 1 1 1 1 1 1 1 1 1 1 
      1 1 1 1 1 1 1 1 1 1 1 
        1 1 1 1 1 1 1 1 1 
          1 1 1 1 1 1 1 
            1 1 1 1 1 
              1 1 1 
                1  
 */
public class A31 {
	public static void main(String[] args) {
		int row = 9;
		for(int i = row, element = 2 * row - 1; i >= 1; i--, element -= 2) {
			for(int j = 1; j <= (row - i); j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= element; j++) {
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
}
