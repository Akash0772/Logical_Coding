package com.akash;

import java.util.Scanner;

// Write a program to rotate one char in given string
public class M42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1 = sc.next();
		String s2 = s1.charAt(s1.length() - 1) + s1.substring(0, s1.length() - 1);
		System.out.println("Given String: " + s1);
		System.out.println("Right rotate by one " + s2);
	}
}
