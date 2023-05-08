package com.akash;
/* In order to get the following output what could be the missing statement
1           1 
  1       1   
    1   1     
      1       
    1   1     
  1       1   
1           1  

 

A.	if(rows == cols || (rows == (8 - rows))) 
                                  
                                                                
                                  
B.	if(rows = cols || (rows == (8))) 
                                  
                                                                
                                  
C.	if(rows == cols || (rows == (8 - cols)))
                                  
*/
public class Q21 {
	public static void main(String[] args) {
        for (int rows = 1; rows <= 7; rows++) {
                for(int cols = 1; cols <= 7; cols++) {
                        if(rows == cols || rows == (8 - cols))/* Statement here */ {
                                System.out.print(1 + " ");
                        }
                        else {
                                System.out.print("  ");
                        }
                }
                System.out.println();
        }
	}
}
