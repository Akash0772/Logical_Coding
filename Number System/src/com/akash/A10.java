package com.akash;

public class A10 {
	public static void main(String[] args) {
		long num = 999999999999999999L;
//		Output
//		999999999999999999:162
//		162:final sum 9
//		long num = 8888888888888888888L;
//		output
//		8888888888888888888:152
//		152:final sum 8
//		long num = 8888888888888888999L;
//		Output
//		8888888888888888999:155
//		155:11
//		11:final sum 2
		
		long num1 = num;
		long sum = 0;
		long digit;
		while(true) {
			System.out.print(num1 + ":");
			while(num1 != 0) {
				digit = num1 % 10;
				sum += digit;
				num1 = num1 / 10;
			}
			if(sum / 10 == 0) {
				break;
			}
			System.out.println(sum);
			num1 = sum;
			sum = 0;
		}
		System.out.println("final sum " + sum);
	}
}
