package com.akash;
/* In order to get the following output what could be the missing statement

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


A.	for(int j = 1; j <= (rows- i); j++) 
                                  
                                                                
                                  
B.	for(int j = 1; j <= (cols - i); j++) 
                                  
                                                                
                                  
C.	for(int j = 1; j <= (cols ); j++) 
*/
public class Q24 {
	 public static void main(String[] args) {
         int rows = 19;
         int upperPattern = (rows / 2) + 1;
         int cols = 10;
         for(int i = 1; i <= rows; i++) {
                 if(i <= upperPattern) {
                	 for(int j = 1; j <= (cols -  i); j++)  /* Statement here */ {
                                 System.out.print("  ");
                         }
                         for(int j = 1; j <= i;j++) {
                                 System.out.print(1 + " ");
                         }
                 }
                 else {
                         for(int j = 1; j <= (i - cols); j++) {
                                 System.out.print("  ");
                         }
                         for(int j = 1; j <= (rows + 1 - i);j++) {
                                 System.out.print(1 + " ");
                         }
                 }
                 System.out.println();
         }
	 }
}
