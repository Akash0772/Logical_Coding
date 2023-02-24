package com.akash;
/*
0     0 
 0   0  
  0 0   
   0    
  0 0   
 0   0  
0     0
 */
public class A38 {
	public static void main(String[] args) {
		for(int i = 1; i < 8; i++) {
			for(int j = 1; j <= 8; j++) {
				if(i == j || i == 8 - j) {
					System.out.print(0);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
