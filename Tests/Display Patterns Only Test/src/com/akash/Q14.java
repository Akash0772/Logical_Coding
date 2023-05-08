package com.akash;
/* In order to get the following output what could be the missing statement
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
6 5 4 3 2 1 
7 6 5 4 3 2 1


A.	System.out.print(cols); 
                                  
                                                                
B.	System.out.print(cols + " "); 
                                  
                                                               
C.	System.out.print(rows+ " "); 
                                  
                                                                                              
D.	System.out.print(rows); 
*/
public class Q14 {
	 public static void main(String[] args) {
         for (int rows = 1; rows <= 7; rows++) {
                 for(int cols = rows; cols >= 1; cols--) {
                        System.out.print(cols + " "); /* Statement here */
                 }
                 System.out.println();
         }
 }
}
