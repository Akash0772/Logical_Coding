package com.akash;

import java.util.Scanner;

//Repeating characters and non repeating characters
public class M36 {
	public static void main(String[] args) {
		System.out.println("Enter a line of word");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char c1;
		String repeatedChars = "", nonRepeatedChars ="";
		loop1:
			for(int i = 0; i < s1.length(); i++) {
				c1 = s1.charAt(i);
				for(int j = i - 1; j >= 0; j--) {
					if(c1 == s1.charAt(j)) {
						continue loop1;
					}
				}
				for(int j = i + 1; j < s1.length(); j++) {
					if(c1 == s1.charAt(j)) {
						repeatedChars += c1 + ", ";
						continue loop1;
					}
				}
				nonRepeatedChars += c1 + ", ";
			}
		System.out.println("repeated chars:" + repeatedChars);
		System.out.println("nonRepeated chars:" + nonRepeatedChars);
	}
}
