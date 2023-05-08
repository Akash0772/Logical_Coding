package com.akash;
/*
Output
4
 */
public class Q5 {
	public static void main(String[] args) {
		int num = 3548;
		int count = 0;
		while(num != 0) {
			count++;
			num = num / 10;
		}
		System.out.println(count);
	}
}
