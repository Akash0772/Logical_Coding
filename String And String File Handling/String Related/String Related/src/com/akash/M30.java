package com.akash;

import java.util.Scanner;

public class M30 {
	public static void main(String[] args) {
		System.out.println("Enter a line of words");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
//		System.out.println(s1);
		int fromIndex = 0;
		int toIndex = s1.lastIndexOf(' ', fromIndex);
		String word;
		while(toIndex != -1) {
			word = s1.substring(fromIndex,toIndex);
			System.out.println(word);
			fromIndex = toIndex - 1;
			toIndex = s1.lastIndexOf(' ', fromIndex);
		}
		word = s1.substring(fromIndex);
		System.out.println(word);
	}
}
