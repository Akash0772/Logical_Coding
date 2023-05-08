package com.akash;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Approach 3
// Write a java program to count the total number of a given character in a string ?
public class M54 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String");
			String s1 = sc.nextLine();
			System.out.println("Enter a char of search");
			String s2 = sc.nextLine();
			int count = 0;
			Pattern p1 = Pattern.compile(s2);
			Matcher m1 = p1.matcher(s1);
			for(; m1.find();) {
				count++;
			}
			System.out.println("occurances:" + count);
		}
}
