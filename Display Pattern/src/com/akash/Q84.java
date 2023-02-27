package com.akash;
/*
    A     
   B  B   
  C    C  
 D      D 
E        E      


 */
public class Q84 {
	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i == (6 - j)) {
					System.out.print((char) (i + 64));
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
