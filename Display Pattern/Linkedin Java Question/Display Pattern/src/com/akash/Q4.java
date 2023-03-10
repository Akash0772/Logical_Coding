package com.akash;
import java.util.Scanner;
// Right-angled Triangle Pattern
/*
Output
Enter a Number
5
Print Right-angled Triangle Pattern
* 
* * 
* * * 
* * * * 
* * * * *  
 */
public class Q4 {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Print Right-angled Triangle Pattern");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
