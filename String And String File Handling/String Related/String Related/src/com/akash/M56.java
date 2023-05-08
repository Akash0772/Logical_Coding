package com.akash;

import java.util.Scanner;
//Approach 5 
// Write a java program to count the total number of a given character in a string ?
public class M56 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String");
			String s1 = sc.nextLine();
			System.out.println("Enter a char of search");
			char c1 = sc.next().charAt(0);
			int count = 0;
			int index = 0;
			while((index = s1.indexOf(c1, index)) != -1) {
				count++;
				index++;
			}
			System.out.println("occurances:" + count);
		}
}
