package com.akash;
/* In order to get the following output what could be the missing statement
7 
6 7 
5 6 7 
4 5 6 7 
3 4 5 6 7 
2 3 4 5 6 7 
1 2 3 4 5 6 7 


A.	System.out.print(cols); 
                                  
                                                                
B.	System.out.print(cols + " "); 
                                  
                                                               
C.	System.out.print(rows+ " "); 
                                  
                                                                                              
D.	System.out.print(rows); 
*/
public class Q15 {
	public static void main(String[] args) {
        for (int rows = 7; rows >= 1; rows--) {
                for(int cols = rows; cols <= 7; cols++) {
                        System.out.print(cols + " ");/* Statement here */
                }
                System.out.println();
        }
	}
}
