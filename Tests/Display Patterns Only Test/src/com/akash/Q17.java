package com.akash;
/* In order to get the following output what could be the missing statement
            1 
          2 1 
        3 2 1 
      4 3 2 1 
    5 4 3 2 1 
  6 5 4 3 2 1 
7 6 5 4 3 2 1

A.	for(int cols = 1; cols <= 7; cols++)                                   
                                                                
                                  
B.	for(int cols = 1; cols <= (7 - rows); cols++)                                   
                                                                
                                  
C.	for(int cols = 1; cols < (8 - 1); cols++) 
*/
public class Q17 {
	public static void main(String[] args) {
        for (int rows = 1; rows <= 7; rows++) {
        	for(int cols = 1; cols <= (7 - rows); cols++)/* Statement here */ {
                        System.out.print("  ");
                }
                for(int cols = rows; cols >= 1;cols-- ) {
                        System.out.print(cols + " ");
                }
                System.out.println();
        }
	}
}
