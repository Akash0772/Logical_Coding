package com.akash;
/* In order to get the following output what could be the missing statement
1 
1 1 
1 1 1 
1 1 1 1 
1 1 1 1 1 
1 1 1 1 1 1 
1 1 1 1 1 1 1 
1 1 1 1 1 1 
1 1 1 1 1 
1 1 1 1 
1 1 1 
1 1 
1 


A.	int firstPattern = (rows / 2) + 1; 
                                  
                                                                
                                  
B.	int firstPattern = (cols / 2) + 1; 
                                  
                                                                
                                  
C.	int firstPattern = (rows % 2) + 1; 
*/
public class Q23 {
	public static void main(String[] args) {
        int rows = 13;
        int firstPattern = (rows / 2) + 1;/* Statement here */
        for(int i = 1; i <= rows; i++) {
                if(i <= firstPattern) {
                        for(int j = 1; j <= i;j++) {
                                System.out.print(1 + " ");
                        }
                }
                else {
                        for(int j = 1; j <= (rows + 1 -i); j++) {
                                System.out.print(1 + " ");
                        }
                }
                System.out.println();
        }
	}
}
