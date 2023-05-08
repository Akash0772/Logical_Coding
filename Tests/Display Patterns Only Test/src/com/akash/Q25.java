package com.akash;
/*
In order to get the following output what could be the missing statement
                1 
              1 1 1 
            1 1 1 1 1 
          1 1 1 1 1 1 1 
        1 1 1 1 1 1 1 1 1 
      1 1 1 1 1 1 1 1 1 1 1 
    1 1 1 1 1 1 1 1 1 1 1 1 1 
  1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 

A.	for(int cols = 1; cols <= (rows - i); cols--)  
                                  
                                                                
                                  
B.	for(int cols = 1; cols <= (cols- i); cols++)  
                                  
                                                                
                                  
C.	for(int cols = 1; cols <= (rows - i); cols++)
*/
public class Q25 {
	public static void main(String[] args) {
        int rows = 9;
        for (int i = 1, element = 1; i <= rows; i++, element += 2) {
        	for(int cols = 1; cols <= (rows - i); cols++) /* Statement here */{
                        System.out.print("  ");
                }
                for(int cols = 1; cols <= element;cols++) {
                        System.out.print(1 + " ");
                }
                System.out.println();
        }
}
}
