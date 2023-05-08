package com.akash;
/* In order to get the following output what could be the missing statement
1 1 1 1 1 1 1 
1           1 
1           1 
1           1 
1           1 
1           1 
1 1 1 1 1 1 1

 A.	if(rows == 1 ||cols == 1) 
                                  
                                                                
                                  
B.	if(rows == 7|| cols == 7) 
                                  
                                                                
                                  
C.	if(rows == 1 ||cols == 1 || rows == 7|| cols == 7)
*/
public class Q18 {
	public static void main(String[] args) {
        for (int rows = 1; rows <= 7; rows++) {
                for(int cols = 1; cols <= 7; cols++) {
                        if(rows == 1 || cols == 1 || rows == 7 || cols == 7)/* Statement here */ {
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
