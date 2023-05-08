package com.akash;
/* In order to get the following output what could be the missing statement
0 
0 0 
0 0 0 
0 0 0 0 
0 0 0 0 0


A.	for(int cols = 1; cols <= 5; cols++)                                    
                                                                
                                  
B.	for(int cols = 1; cols < rows; cols++)  
                                  
                                                                                                  
C.	for(int cols = 1; cols <= rows; cols++)
*/
public class Q11 {
	public static void main(String[] args) {
        for (int rows = 1; rows <= 5; rows++) {
                for(int cols = 1; cols <= rows; cols++)/* Statement here */{
                        System.out.print(0 + " ");
                }
                System.out.println();
        }
}
}
