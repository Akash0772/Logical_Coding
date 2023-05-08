package com.akash;
/* In order to get the following output what could be the missing statement
1111111111
1111111111
1111111111
1111111111
1111111111
1111111111
1111111111
1111111111
1111111111
1111111111


A.	System.out.print("1"); 
                                  
                                         
B.	System.out.println("1"); 
                                  
                                                                                          
C.	System.out.print(i); 
                                  
                                                                
D.	System.out.print(j);
*/
public class Q1 {
	public static void main(String[] args) {
		int rows = 10;
		int cols = 10;
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= cols; j++) {
				System.out.print("1"); /* Statement here */
			}
			System.out.println();
		}
	}
}
