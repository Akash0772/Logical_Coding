package com.akash;
/* In order to get the following output what could be the missing statement
1 1 1 1 1 1 1 
          1   
        1     
      1       
    1         
  1           
1 1 1 1 1 1 1   

 

A.	if(rows == 1 || cols== 7 || (rows == (8 - cols))) 
                                  
                                                                
                                  
B.	if(rows == 1 || rows == 7 || (rows == (8 - cols))) 
                                  
                                                                
                                  
C.	if(rows == 1 || rows == 7 || (rows == (8 - rows))) 
                                  
*/
public class Q22 {
	public static void main(String[] args) {
        for (int rows = 1; rows <= 7; rows++) {
                for(int cols = 1; cols <= 7; cols++) {
                        if(rows == 1 || rows == 7 || rows == (8 - cols))/* Statement here */ {
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
