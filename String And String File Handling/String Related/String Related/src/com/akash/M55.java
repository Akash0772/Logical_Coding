package com.akash;

import java.util.Scanner;
//Approach 4 is the best approach
// Write a java program to count the total number of a given character in a string ?
public class M55 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String");
			String s1 = sc.nextLine();
			System.out.println("Enter a char of search");
			char c1 = sc.next().charAt(0);
			int count = 0;
			int index = s1.indexOf(c1, 0);
			while(index != -1) {
				count++;
				index = s1.indexOf(c1, index + 1);
			}
			System.out.println("occurances:" + count);
		}
}
