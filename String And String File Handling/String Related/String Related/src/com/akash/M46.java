package com.akash;

import java.util.Scanner;

// Find out how many words are there in a given String
public class M46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		String[] words = s1.split("\\s");
//		String[] words = s1.split(" ");
//		String[] words = s1.split("\\s+");
		int wordCount = words.length;
		System.out.println("given String: " + s1);
		System.out.println("length: " + wordCount);
	}
}
