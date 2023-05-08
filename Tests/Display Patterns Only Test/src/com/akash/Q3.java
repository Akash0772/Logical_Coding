package com.akash;
/* In order to get the following output what could be the missing statement
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * *


A.	System.out.print(ln); 
                                  
                                                                
B.	System.out.println(); 
                                  
                                                                
C.	System.out.print(newLine()); 
                                  
                                                                                              
D.	None 
*/
public class Q3 {
	public static void main(String[] args) {
		int rows = 5;
		int cols = 5;
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= cols; j++) {
				System.out.print("* "); 
			}
			System.out.println(); /* Statement here */
		}
	}
}
