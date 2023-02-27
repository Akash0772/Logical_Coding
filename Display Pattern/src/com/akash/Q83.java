package com.akash;
/*
     5    
    4 4   
   3   3  
  2     2 
 1       1      


 */
public class Q83 {
	public static void main(String[] args) {
		int n = 6;
		for(int i = n; i >= 1; i--) {
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
