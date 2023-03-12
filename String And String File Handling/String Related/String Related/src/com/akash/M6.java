package com.akash;
/*
Output
hello
o
l
l
e
h
 */
public class M6 {
	public static void main(String[] args) {
		String s1 = "hello";
//					 01234
		System.out.println(s1);
		char c1;
		for(int i = s1.length() - 1; i >= 0; i--) {
//			System.out.print(s1.charAt(i) + " ");
			c1 = s1.charAt(i);
			System.out.println(c1);
		}
	}
}
