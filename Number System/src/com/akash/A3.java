package com.akash;

public class A3 {
	public static void main(String[] args) {
		int num = 3548;
		int count = 0;
		while(num != 0) {
			count++;
			num = num / 10;
		}
		System.out.println(count);//4
	}
}
