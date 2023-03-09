package com.akash;

public class A9 {
	public static void main(String[] args) {
		int num1 = 45901223;
		int digitCount = 0;
		int temp = num1;
		
		while(temp != 0) {
			digitCount++;
			temp = temp / 10;
		}
		
		int factor = 1;
		for(int i = 1; i <= (digitCount / 2); i++) {
			factor = factor * 10;
		}
		int firstHalf = num1 / factor;
		int secondHalf = num1 % factor;
		int revInSecondHalf = firstHalf;
		while(secondHalf != 0) {
			revInSecondHalf = (revInSecondHalf * 10) + (secondHalf % 10);
			secondHalf = secondHalf / 10;
		}
		System.out.println(num1);
		System.out.println(revInSecondHalf); //45903221
	}
}
