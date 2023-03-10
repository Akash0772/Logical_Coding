package com.akash;
import java.util.Scanner;
// n x n star rectangle
/*
Output
Enter a Number n X n 
5
4
Print n X n star rectangle
* * * * 
*     * 
*     * 
*     * 
* * * * 

Enter a Number n X n 
4
5
Print n X n star rectangle
* * * * * 
*       * 
*       * 
* * * * * 

Enter a Number n X n 
7
8
Print n X n star rectangle
* * * * * * * * 
*             * 
*             * 
*             * 
*             * 
*             * 
* * * * * * * * 
 */
public class Q11 {
	public static void main(String[] args) {
		System.out.println("Enter a Number n X n ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println("Print n X n star rectangle");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				if(i == 1 || j == 1 || i == n || j == m) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
