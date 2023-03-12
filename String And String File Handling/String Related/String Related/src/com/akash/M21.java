package com.akash;
/*
Output
Number of words in java is better than apple is 4
 */
public class M21 {
	public static void main(String[] args) {
		String s1 = "java is better than apple";
//		             0123
//		right to left
		int i = s1.indexOf(' ');
		int words = 0;
//		using while loop
		while(i != -1) {
			words++;
			i = s1.indexOf(' ', i + 1);
		}
		System.out.println("Number of words in " + s1 + " is " + words);
	}
}
