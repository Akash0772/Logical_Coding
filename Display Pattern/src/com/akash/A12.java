package com.akash;
/*
1 2 3 4 5 
2 0 0 0 4 
3 0 0 0 3 
4 0 0 0 2 
5 4 3 2 1    
 */
public class A12 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			//first Line
			if(i == 1) {
				for(int j = 1; j <= 5; j++) {
					System.out.print(j + " ");
				}
			}
			//middle Line
			if(i > 1 && i < 5) {
				for(int j = 1; j <= 5; j++) {
					if(j == 1) {
						System.out.print(i + " ");
					}else if(j == 5){
						System.out.print((6 - i) + " ");
					}else {
						System.out.print(0 + " ");
					}
				}
			}
			//last line
			if(i == 5) {
				for(int j = 5; j >= 1; j--) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}