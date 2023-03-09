package com.akash;

public class A7 {
	public static void main(String[] args) {
		int num1 = 757665312;
		int revNum = 0;
		int digit;
		
		while(num1 != 0) {
			digit = num1 % 10;
			revNum = (revNum * 10) + digit;
			num1 = num1 / 10;
		}
		System.out.println(revNum); //213566757
	}
}