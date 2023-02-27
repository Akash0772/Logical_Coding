package com.akash;
/*
          
E        E
 D      D 
  C    C  
   B  B   
    A     
       


 */
public class Q90 {
	public static void main(String[] args) {
		for(int i = 6; i >= 1; i--) {
			for(int j = 1; j <= 6; j++) {
				if(i == (6 - j)) {
					System.out.print((char)(i + 64));
				}else {
					System.out.print(" ");
				}
			}
			for(int j = 2; j <= 5; j++) {
				if(i == j) {
					System.out.print((char)(i + 64));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
