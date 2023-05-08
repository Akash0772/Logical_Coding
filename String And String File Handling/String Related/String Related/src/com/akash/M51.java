package com.akash;

import java.util.Scanner;

// Rotate the string word wise by one right rotate
public class M51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		String lastWord = s1.substring(s1.lastIndexOf(' ') + 1);
		String s2 = lastWord + " " + s1.substring(0, s1.lastIndexOf(' '));
		System.out.println("Given string:" + s1);
		System.out.println("Right rotate by one:" + s2);
	}
}
