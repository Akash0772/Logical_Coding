package com.akash;
/* In order to get the following output what could be the missing statement
5 5 5 5 5 
4 4 4 4 4 
3 3 3 3 3 
2 2 2 2 2 
1 1 1 1 1


A.	for(int rows = 1; rows <= 5;rows++)                               
                                                                
                                  
B.	for(int rows = 5; rows >= 1;rows--) 
                                  
                                                                                                  
C.	none 
*/
public class Q8 {
	public static void main(String[] args) {
        for(int rows = 5; rows >= 1; rows--)/* Statement here */ {
                for(int cols = 1; cols <= 5; cols++) {
                        System.out.print(rows + " ");
                }
                System.out.println();
        }
}
}
