package com.akash;
/*
          0 0         
         0   0        
        0     0       
       0       0      
      0         0     
     0           0    
    0             0   
   0               0  
  0                 0 
 0                   0
0                                           
 */
public class A40 {
	public static void main(String[] args) {
		for(int i = 1; i <= 22; i++) {
			for(int j = 1; j <= 22; j++) {
				if(j == (12 - i) || j == (12 + i)) {
					System.out.print(0);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
