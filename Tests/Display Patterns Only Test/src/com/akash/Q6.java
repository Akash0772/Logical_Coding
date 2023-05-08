package com.akash;
/* In order to get the following output what could be the missing statement
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5


A.	System.out.print(rows); 
                                  
                                                                
B.	System.out.print(cols); 
                                  
                                                                
C.	System.out.print(rows + " "); 
                                  
                                                                                              
D.	System.out.print(cols + " ");
*/
public class Q6 {
	public static void main(String[] args) {
        for(int rows = 1; rows <= 5;rows++) {
                for(int cols = 1; cols <= 5; cols++) {
                        System.out.print(rows + " ");/* Statment here */
                }
                System.out.println();
        }
}
}
