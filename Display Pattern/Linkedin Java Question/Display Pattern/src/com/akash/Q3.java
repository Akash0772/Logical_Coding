package com.akash;
import java.util.Scanner;
// n x m star rectangle
/*
Output
Enter a Number n X n 
Enter a Number n X m 
4
4
Print n X m star rectangle
* * * * 
* * * * 
* * * * 
* * * * 

Enter a Number n X m 
6
5
Print n X m star rectangle
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
 */
public class Q3 {
	public static void main(String[] args) {
		System.out.println("Enter a Number n X m ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println("Print n X m star rectangle");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
