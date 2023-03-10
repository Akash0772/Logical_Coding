package com.akash;
import java.util.Scanner;
// n x n star rectangle
/*
Output
Enter a Number n X n 
5
Print n X n star rectangle
*       * 
*       * 
*       * 
*       * 
* * * * *  
 */
public class Q13 {
	public static void main(String[] args) {
		System.out.println("Enter a Number n X n ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Print n X n star rectangle");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
