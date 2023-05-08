package com.akash;
/*
Output

 */
public class Q15 {
	public static void main(String[] args) {
		int num = 28;
//		int num1 = num;
		int sum = 0;
		for(int i = 1; i <= (num / 2); i++) {
			if(num % i == 0) {
				sum += i;
//				System.out.print(sum + ", ");
			}
//			System.out.print(num + ", ");
		}
//		System.out.println();
		if(num == sum) {
			System.out.println(num + " is a perfect number");
		}
		else {
			System.out.println(num + " is not a perfect number");
		}
	}
}
