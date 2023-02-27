package com.akash;
/*
 A       A
  B     B 
   C   C  
    D D   
     E        


 */
public class Q89 {
	public static void main(String[] args) {
		int n = 6;
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= 1; j--) {
				if(i == (n - j)) {
					System.out.print((char)(i + 64));
				}else {
					System.out.print(" ");
				}
			}
			for(int j = n-2; j >= 1; j--) {
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
