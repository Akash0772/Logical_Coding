package com.akash;
/*
1 2 3 4 5 
5 4 3 2 1 
1 2 3 4 5 
5 4 3 2 1 
1 2 3 4 5   
 */
public class A11 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			//Check EVEN or OOD
			//Because 1, 3, 5 line 1 to 5 print but 2 and 4 line 5 to 1 print
 			if(i % 2 == 0) {
				for(int j = 5; j >= 1; j--) {
					System.out.print(j + " ");
				}
			}else {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
		}
			System.out.println();
		}
	}
}