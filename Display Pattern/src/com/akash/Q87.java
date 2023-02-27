package com.akash;
/*
 1       1
  2     2 
   3   3  
    4 4   
     5       


 */
public class Q87 {
	public static void main(String[] args) {
		int n = 6;
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= 1; j--) {
				if(i == (n - j)) {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}
			for(int j = n-2; j >= 1; j--) {
				if(i == j) {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
