package com.akash;
import java.util.Scanner;
//Q17. Find out if the given number is a Palindrome3 or not? 
/*
Output
Enter a value
121
This is Palindrome
 */
public class Q17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int num = sc.nextInt();
		int temp = num;
		int digit;
		int revNum = 0;
		while(num != 0) {
			
			digit = num % 10;
			revNum = (revNum * 10) + digit;
			num = num / 10;
		}
		if(revNum == temp) {
			System.out.println("This is Palindrome");
		}else {
			System.out.println("This is Not Palindrome");
		}
	}
}