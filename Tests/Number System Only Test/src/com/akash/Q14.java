package com.akash;
/*
Output
1634 is armstrong
 */
public class Q14 {
	public static void main(String[] args) {
		int num = 1634;
		int num1 = num, num2 = num;
		int digitCount = 0;
		while(num1 != 0) {
			digitCount++;
			num1 = num1 / 10;
		}
		int digitPower = 1;
		int allDigitsSum = 0;
		int digit;
		while(num2 != 0) {
			digit = num2 % 10;
			for(int i = 1; i <= digitCount; i++) {
				digitPower = digitPower * digit;
			}
			allDigitsSum += digitPower;
			digitPower = 1;
			num2 = num2 / 10;
		}
		if(num == allDigitsSum) {
			System.out.println(num + " is armstrong");
		}
		else {
			System.out.println(num + " is not armstrong");
		}
	}
}
