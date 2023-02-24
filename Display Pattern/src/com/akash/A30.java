package com.akash;
/*
                1 
              1 1 1 
            1 1 1 1 1 
          1 1 1 1 1 1 1 
        1 1 1 1 1 1 1 1 1 
      1 1 1 1 1 1 1 1 1 1 1 
    1 1 1 1 1 1 1 1 1 1 1 1 1 
  1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 

 */
public class A30 {
	public static void main(String[] args) {
		int row = 9;
		for(int i = 1, element = 1; i <= row; i++, element += 2) {
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
