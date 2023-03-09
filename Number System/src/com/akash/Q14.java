package com.akash;
import java.util.Scanner;
//Q14. Find out total digits of a given number? 
/*
Output
Enter a value
567784
6

 */
public class Q14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int num = sc.nextInt();
		int digitCount = 0;
		while(num != 0) {
			digitCount++;
			num = num / 10;
		}
		System.out.println(digitCount);
	}
}
