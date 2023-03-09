package com.akash;
/*
   153
   1 + 125 + 27 = 153
   
   370
   27 + 343 = 370
   
   1634
   1 + 1296 + 81 + 256 = 1634
   
 */
public class A15 {
	public static void main(String[] args) {
		int num = 1634;
		int num1 = num, num2 = num;
		int digitsCount = 0;
		
		while(num1 != 0) {
			digitsCount++;
			num1 = num1 / 10;
		}
		int digitPower = 1;
		int allDigitsSum = 0;
		int digit;
		
		while(num2 != 0) {
			digit = num2 % 10;
			for(int i = 1; i <= digitsCount; i++) {
				digitPower =digitPower * digit;
			}
			allDigitsSum += digitPower;
			digitPower = 1;
			num2 = num2 / 10;
		}
		if(num == allDigitsSum) {
			System.out.println(num + " is armstrong");
		}else {
			System.out.println(num + " is not an armstrong");
		}
	}
}
