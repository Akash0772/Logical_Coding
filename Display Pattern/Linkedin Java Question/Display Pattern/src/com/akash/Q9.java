package com.akash;
import java.util.Scanner;
// Inverted Right-angled Triangle of whole numbers
/*
Output
Enter a Number
7
Print Inverted Right-angled Triangle of whole numbers
1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1   
 */
public class Q9 {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Print Inverted Right-angled Triangle of whole numbers");
		for(int i = n; i >= 1 ; i--) {
//			for(int j = 1; j <= n - i; j++) {
//				System.out.print("  ");
//			}
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
