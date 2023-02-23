package com.akash;
// Q5. Print true, if the sum of any 2 numbers is a 3rd given number.
import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//Sum
		int sum = num1 + num2;
		//condition 
		if(sum == num3) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
