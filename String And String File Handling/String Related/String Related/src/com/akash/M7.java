package com.akash;
/*
Output
hello
h
e
l
l
o
 */
public class M7 {
	public static void main(String[] args) {
		String s1 = "hello";
//					 01234
		System.out.println(s1);
		char[] chars = s1.toCharArray();
		char c1;
		for(int i = 0; i < chars.length; i++) {
//			System.out.print(s1.charAt(i) + " ");
			c1 = chars[i];
			System.out.println(c1);
		}
	}
}
