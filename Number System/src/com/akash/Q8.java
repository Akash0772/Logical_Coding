package com.akash;
//Q8. Find out the immediate next 5 multiple of a given number?
/*
Enter the number
4
4 is 5 multiple squre 1024
 */
import java.util.Scanner;
public class Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		
		int squre5 = a * a * a * a * a;
		System.out.println(a + " is 5 multiple squre " + squre5);
	}
}
