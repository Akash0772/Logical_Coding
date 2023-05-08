package com.akash;

import java.util.Scanner;
//Approach 2
// Write a java program to count the total number of a given character in a string ?
public class M53 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String");
			String s1 = sc.nextLine();
			System.out.println("Enter a char of search");
			char c1 = sc.next().charAt(0);
			int count = 0;
			char[] chars = s1.toCharArray();
			for(int i = 0; i < chars.length; i++) {
				if(s1.charAt(i) == c1) {
					count++;
				}
			}
			System.out.println("occurances:" + count);
		}
}
