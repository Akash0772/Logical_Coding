package com.akash;
/*
 	6 = 1 + 2 + 3
 	28 = 1 + 2 + 4 + 7 + 14
 	
 */
public class A16 {
	public static void main(String[] args) {
		int num = 28;
		int sum = 0;
		for(int i = 1; i <= (num / 2); i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		if(num == sum) {
			System.out.println(num + " is a perfect num");
		}else {
			System.out.println(num + " is not a perfect num");
		}
	}
}
