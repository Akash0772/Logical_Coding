package com.akash;
import java.util.Scanner;
// Inverted Right-angled Triangle Pattern
/*
Output
Enter a Number
5
Print Inverted Right-angled Triangle Pattern
* * * * * 
* * * * 
* * * 
* * 
*   
 */
public class Q5 {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Print Inverted Right-angled Triangle Pattern");
		for(int i = n; i >= 0 ; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
