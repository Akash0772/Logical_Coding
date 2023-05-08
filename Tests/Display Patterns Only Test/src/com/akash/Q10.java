package com.akash;
/* In order to get the following output what could be the missing statement
1 2 3 4 5 
5 4 3 2 1 
1 2 3 4 5 
5 4 3 2 1 
1 2 3 4 5

 A.	System.out.print(rows+ " ");
 	System.out.print(cols + " "); 
                                  
                                                                                                  
B.	System.out.print(cols + " ");
	System.out.print(rows+ " "); 
                                  
                                                                                                 
C.	System.out.print(cols + " ");
	System.out.print(cols + " ");                               
                                                                
                                  
D.	System.out.print(rows+ " ");
	System.out.print(rows+ " "); 
*/
public class Q10 {
	public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
                if(i % 2 == 0) {
                        for( int cols = 5; cols >= 1; cols --) {
                               System.out.print(cols + " ");/* Statement here */
                        }
                        System.out.println();
                }
                else {
                        for(int cols = 1; cols <= 5; cols++) {
                                System.out.print(cols + " ");/* Statement here */
                        }
                        System.out.println();
                }
        }
}
}
