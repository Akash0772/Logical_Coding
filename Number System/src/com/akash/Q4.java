package com.akash;
// Q4. Print ascending order of 3 given numbers.
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		//condition 
		if(num1 >= num2 && num1 >= num3) {
			if(num2 >= num3) {
				System.out.println("Descending order is " + num1 + "," + num2 + "," + num3);
				System.out.println("Ascending order is " + num3 + "," + num2 + "," + num1);
			}else {
				System.out.println("Descending order is " + num1 + "," + num3 + "," + num2);
				System.out.println("Ascending order is " + num2 + "," + num3 + "," + num1);
			}
		}else if(num2 >= num1 && num2 >= num3) {
			if(num1 >= num3) {
				System.out.println("Descending order is " + num2 + "," + num1 + "," + num3);
				System.out.println("Ascending order is " + num3 + "," + num1 + "," + num2);
			}else {
				System.out.println("Descending order is " + num2 + "," + num3 + "," + num2);
				System.out.println("Ascending order is " + num1 + "," + num3 + "," + num2);
			}
		}else if(num3 >= num1 && num3 >= num2) {
			if(num1 >= num2) {
				System.out.println("Descending order is " + num3 + "," + num1 + "," + num2);
				System.out.println("Ascending order is " + num2 + "," + num1 + "," + num3);
			}else {
				System.out.println("Descending order is " + num1 + "," + num3 + "," + num2);
				System.out.println("Ascending order is " + num1 + "," + num2 + "," + num3);
			}
		}
			
	}
}
