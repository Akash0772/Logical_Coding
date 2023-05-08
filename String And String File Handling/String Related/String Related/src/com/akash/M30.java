package com.akash;

import java.util.Scanner;

public class M30 {
	/*
	First Approach
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String[] str = string.split(" ");
		String reverse="";
		int x = str.length;
		for(int i=x-1; i>=0; i--) {
			reverse = reverse + str[i] + " ";
		}
		System.out.println(reverse);
	}
		 */
	public static void main(String[] args) {
		System.out.println("Enter a Line of word");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
//		btm is java
//		0123456789
		int fromIndex = s1.lastIndexOf(' ');
		int toIndex = s1.length();
		String word;
		while(fromIndex != -1) {
			word = s1.substring(fromIndex + 1, toIndex);
			System.out.println(word);
			toIndex = fromIndex;
			fromIndex = s1.lastIndexOf(' ', toIndex - 1);
		}
		word = s1.substring(0, toIndex);
		System.out.println(word);
	}
}
