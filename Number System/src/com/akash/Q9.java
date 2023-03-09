package com.akash;
//Q9. Print all odd numbers between two given numbers?
/*
Enter the two number
5
10
5, 7, 9, 
 */
import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = a; i <= b; i++) {
			if((i % 2) == 1) {
				System.out.print(i + ", ");
			}
		}
	}
}
