package com.akash;

import java.util.Scanner;

// Find out length of the string without length() method of a string
public class M44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1 = sc.next();
//		s1 = hello
//			 01234
		int length = (s1 + 't').lastIndexOf('t');
		System.out.println("Given String: " + s1);
		System.out.println("length " + length);
	}
}
