package com.akash;
/*
OutPut
999999999999999999:
162
162:
final sum: 9
21
 */
public class Q9 {
	public static void main(String[] args) {
		long num = 999999999999999999L;
		long num1 = num;
		long sum = 0;
		long digit;
//		int count = 0;
		while(true) {
			System.out.println(num1 + ":");
			while(num1 != 0) {
//				count ++;
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
		System.out.println("final sum: " + sum);
//		System.out.println(count);
	}
}
