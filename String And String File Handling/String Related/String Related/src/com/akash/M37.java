package com.akash;

import java.util.Scanner;

// Write a program to reverse in String
public class M37 {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		char[] c1 = s1.toCharArray();
		char temp;
		for(int i = 0; i < (c1.length / 2); i++) {
			temp = c1[i];
			c1[i] = c1[c1.length - i - 1];
			c1[c1.length - i - 1] = temp;
		}
		String s2 = new String(c1);
		System.out.println("Given String:" + s1);
		System.out.println("Reversed String:" + s2);
	}
}
