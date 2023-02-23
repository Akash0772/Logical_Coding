package com.akash;
// Q6. Print true, if the sum of squares of any 2 numbers is a 3rd given number.
import java.util.Scanner;
public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter the target number");
		int tar = sc.nextInt();
		
		//Find Square
		int aSqr = a*a;
		int bSqr = b*b;
		
		//Find Square Sum
		int sum = aSqr + bSqr;
		
		//Condition
		if(sum == tar) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
