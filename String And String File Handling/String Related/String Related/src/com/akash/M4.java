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
public class M4 {
	public static void main(String[] args) {
		String s1 = "hello";
//					 01234
		System.out.println(s1);
		for(int i = 0; i < s1.length(); i++) {
//			System.out.print(s1.charAt(i) + " ");
			char c1 = s1.charAt(i);
			System.out.println(c1);
		}
	}
}
