package com.akash;
import java.util.Scanner;
// Right triangle of 5 multiples
/*
Output
Enter a Number
6
Right triangle of 5 multiples
5 
5 10 
5 10 15 
5 10 15 20 
5 10 15 20 25 
5 10 15 20 25 30     
 */
public class Q10 {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Right triangle of 5 multiples");
		for(int i = 1; i <= n ; i++) {
//			for(int j = 1; j <= n - i; j++) {
//				System.out.print("  ");
//			}
			for(int j = 1; j <= i; j++) {
				System.out.print(j * 5 + " ");
			}
			System.out.println();
		}
	}
}
