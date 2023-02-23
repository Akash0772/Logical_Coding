package com.akash;
// Q3. Print middle number from 3 given numbers. 
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int maxValue = 0;
		int minValue = 0;
		int midValue;
		
		// Condition Find Maximum Value
		if(num1 > num2 && num1 > num3) {
		     maxValue += num1;
		}else if(num2 > num3 && num2 > num1){
			 maxValue += num2;
		}else if(num3 > num1 && num3 > num2) {
			 maxValue += num3;
		}
		
		// Condition Find Minimum Value
		if(num1 < num2 && num1 < num3) {
		     minValue += num1;
		}else if(num2 < num3 && num2 < num1){
			 minValue += num2;
		}else if(num3 < num1 && num3 < num2) {
			 minValue += num3;
		}
		
		// Find Mid Value Logic
		midValue = num1 + num2 + num3 - maxValue - minValue;
		
		//Print
		System.out.println("A Middle Value is " + midValue);
	}
}
