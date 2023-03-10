package com.akash;
// Stars in same line
/*
Output
Enter a Number
5
Print Stars in same line 
*****

Enter a Number
7
Print Stars in same line 
*******

Enter a Number
9
Print Stars in same line 
*********
 */
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Print Stars in same line ");
		for(int i = 1; i <= num; i++) {
			System.out.print("*");
		}
	}
}
