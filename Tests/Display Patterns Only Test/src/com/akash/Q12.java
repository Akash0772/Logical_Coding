package com.akash;
/* In order to get the following output what could be the missing statement
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 

A.	System.out.print(cols); 
                                                                                                  
                                  
B.	System.out.print(rows + " "); 
                                  
                                                                                              
C.	System.out.print(cols + " "); 
*/
public class Q12 {
	public static void main(String[] args) {
        for (int rows = 1; rows <= 7; rows++) {
                for(int cols = 1; cols <= rows; cols++) {
                      System.out.print(cols + " "); /* Statement here */
                }
                System.out.println();
        }
}
}
