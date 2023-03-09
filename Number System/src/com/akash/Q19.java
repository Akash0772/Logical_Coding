package com.akash;
//Assume a given number containing 3 digits. now check it out first two digits’ sum is 3rd digit or not?
/*
Output
Enter a three number
2
2
4
Found

 */
import java.util.Scanner;
public class Q19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a + b;
		if(sum == c) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
	}
}
