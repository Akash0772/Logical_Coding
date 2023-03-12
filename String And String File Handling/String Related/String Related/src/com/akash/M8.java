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
public class M8 {
	public static void main(String[] args) {
		String s1 = "hello";
//					 01234
		System.out.println(s1);
		char[] chars = s1.toCharArray();
//		for each loop
		for(char c1 : chars) {
			System.out.println(c1);
		}
	}
}
