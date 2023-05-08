package com.akash;
/* In order to get the following output what could be the missing statement
1 1 1 1 1 
1 1 1 1 1 
1 1 1 1 1 
1 1 1 1 1 
1 1 1 1 1 
1 1 1 1 1 
1 1 1 1 1 
1 1 1 1 1 
1 1 1 1 1 
1 1 1 1 1

A.	for(int cols = 1; cols <= 10; cols++) 
                                                                                                
                                  
B.	for(int cols = 1; cols <= 5; cols++) 
                                                                                              
                                  
C.	for(int cols = 1; cols < 10; cols++) 
                                  
                                                                                              
D.	for(int cols = 1; cols < 5; cols++) 
*/
public class Q5 {
	public static void main(String[] args) {
        for(int rows = 1; rows <= 10;rows++) {
               for(int cols = 1; cols <= 5; cols++){ /* Statement here */ 
                        System.out.print(1+ " ");
                }
                System.out.println();
        }
	}
}
