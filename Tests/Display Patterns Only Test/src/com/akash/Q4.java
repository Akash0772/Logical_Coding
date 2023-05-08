package com.akash;
/* In order to get the following output what could be the missing statement
1 1 1 1 1 1 1 1 1 1 
1 1 1 1 1 1 1 1 1 1 
1 1 1 1 1 1 1 1 1 1 
1 1 1 1 1 1 1 1 1 1 
1 1 1 1 1 1 1 1 1 1

A.	for(int cols = 1; cols <= 10; cols++) 
                                                                
                                  
B.	for(int cols = 1; cols <= 5; cols++) 
                                                                                              
                                  
C.	for(int cols = 1; cols < 10; cols++)                               
                                                                
                                  
D.	for(int cols = 1; cols < 5; cols++) 
*/
public class Q4 {
	public static void main(String[] args) {
		int rows = 5;
		int cols = 10;
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= cols; j++) {  /* Statement here */
				System.out.print("1 "); 
			}
		System.out.println(); 
		}
	}	
}
