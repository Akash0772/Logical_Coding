package com.akash;
/* In order to get the following output what could be the missing statement
              *
            * *
          * * *
        * * * *
      * * * * *
    * * * * * *
  * * * * * * *
* * * * * * * *
A.	for(int cols = 1; cols <= 8; cols++)                               
                                                                
                                  
B.	for(int cols = 1; cols <= (8 - rows); cols++)                               
                                                                
                                  
C.	for(int cols = 1; cols < (8 - 1); cols++) 
*/
public class Q16 {
	public static void main(String[] args) {
        for (int rows = 1; rows <= 8; rows++) {
                for(int cols = 1; cols <= 8 - rows;  cols++)/* Statement here  */ {
                        System.out.print("  ");
                }
                for(int cols = 1; cols <= rows;cols++ ) {
                        System.out.print(" *");
                }
                System.out.println();
        }
	}
}
