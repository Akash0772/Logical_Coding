package com.akash;
/* In order to get the following output what could be the missing statement
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1


A.	for(int cols = 1; cols <= 5; cols++) 
                                  
                                                                                              
B.	for(int cols = 5; cols > 1; cols--) 
                                  
                                                                                              
C.	for(int cols = 5; cols >= 1; cols--) 
                                  
                                                                                                  
D.	None
*/
public class Q9 {
	public static void main(String[] args) {
        for(int rows = 1; rows <= 5;rows++) {
                for(int cols = 5; cols >= 1; cols--)/* Statement here */ {
                        System.out.print(cols + " ");
                }
                System.out.println();
        }
}
}
