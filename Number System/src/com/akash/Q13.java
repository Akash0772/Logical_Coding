package com.akash;
import java.util.Scanner;
//Q13. Swap two int variables without the 3rd variable? 
/*
Output
Enter a two value
4
6
6 4
 */
public class Q13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 3rd variable use
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}
}
