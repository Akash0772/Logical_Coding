package com.akash;

import java.util.Scanner;

// Write a program to reverse in String with built in Method
public class M38 {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
//		String s2 = new StringBuffer(s1).reverse().toString();
		String s2 = new StringBuilder(s1).reverse().toString();
		System.out.println("Given String:" + s1);
		System.out.println("Reversed String:" + s2);
	}
}
