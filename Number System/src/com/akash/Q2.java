package com.akash;
// Q2. Print a smaller number from 3 given numbers.
/*
Output
Enter three numbers
5
6
4
A smaller Number is 4
 */
import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//condition 
		if(num1 < num2 && num1 < num3) {
			System.out.println("A Smaller Number is " + num1);
		}else if(num2 < num3 && num2 < num1){
			System.out.println("A Smaller Number is " + num2);
		}else {
			System.out.println("A smaller Number is " + num3);
		}
	}
}
