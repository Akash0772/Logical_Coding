package com.akash;
// Q1. Print a bigger number from 2 given numbers.
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//condition 
		if(num1 < num2) {
			System.out.println("A Bigger Number is " + num2);
		}else {
			System.out.println("A Bigger Number is " + num1);
		}
	}
}
