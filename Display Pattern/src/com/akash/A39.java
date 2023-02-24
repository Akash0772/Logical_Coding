package com.akash;
/*
          0             
         0              
        0               
       0                
      0                 
     0                  
    0                   
   0                    
  0                     
 0                      
0                       
 */
public class A39 {
	public static void main(String[] args) {
		for(int i = 1; i <= 24; i++) {
			for(int j = 1; j <= 24; j++) {
				if(j == (12 - i)) {
					System.out.print(0);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
