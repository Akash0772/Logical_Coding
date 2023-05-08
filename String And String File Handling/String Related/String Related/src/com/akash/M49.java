package com.akash;

import java.util.Scanner;
// Recursive Algorithm
// Write a program to reverse the given String word wise ?
public class M49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = sc.nextLine();
		String s2 = reveseWordWise(s1);
		s2 = s2.trim();
		System.out.println(s2);
	}
	private static String reveseWordWise(String s1) {
		if(s1.lastIndexOf(' ') == -1) {
			return s1;
		}
		return s1.substring(s1.lastIndexOf(' ') + 1, s1.length()) + " " +
				reveseWordWise(s1.substring(0, s1.lastIndexOf(' ')));
 	}
}
