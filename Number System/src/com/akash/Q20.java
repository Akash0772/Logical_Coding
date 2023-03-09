package com.akash;
//20. Find out the factorial value for a given number?
/*
Enter a number
5
120
 */
import java.util.Scanner;
public class Q20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int fac = 1;
		for(int i = 1; i <= num; i++) {
			fac = fac * i;
		}
		System.out.println(fac);
	}
}
