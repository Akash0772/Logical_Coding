package com.akash;
/* In order to get the following output what could be the missing statement
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
6 6 6 6 6 6 
7 7 7 7 7 7 7 

A.	System.out.print(cols); 
                                                                                                  
                                  
B.	System.out.print(rows + " "); 
                                  
                                                                                              
C.	System.out.print(cols + " "); 
*/
public class Q13 {
	public static void main(String[] args) {
        for (int rows = 1; rows <= 7; rows++) {
                for(int cols = 1; cols <= rows; cols++) {
                      System.out.print(rows + " "); /* Statement here */
                }
                System.out.println();
        }
}
}
