package com.akash;

import java.util.Scanner;
import java.util.Arrays;
//Find the number of characters in a string which occurs exactly twice in a string 
public class Q30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
//		System.out.println(s1);
		char[] ch = s1.toCharArray();
//		System.out.println(java.util.Arrays.toString(ch));
		int count = 0;
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] == s1.charAt(i)) {
				count++;
			}
//			System.out.println(ch[i]);
		}
		System.out.println(count);
	}
}
