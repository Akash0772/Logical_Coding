package com.akash;
//Q7. Find out if a given number is an even or odd?
/*
Enter the number
4
even

Enter the number
3
odd
 */
import java.util.Scanner;
public class Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		
		//Condition
		if((a % 2) == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
}
