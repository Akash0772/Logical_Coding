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
public class M9 {
	public static void main(String[] args) {
		String s1 = "hello";
//					 01234
		System.out.println(s1);
		char[] chars = s1.toCharArray();
		char c1;
		for(int i = chars.length - 1; i >= 0; i--) {
			c1 = chars[i];
			System.out.println(c1);
		}
	}
}
