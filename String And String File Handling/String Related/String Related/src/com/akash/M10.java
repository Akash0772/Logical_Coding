package com.akash;
/*
Output
hello
[h, e, l, l, o]
 */
public class M10 {
	public static void main(String[] args) {
		String s1 = "hello";
//					 01234
		System.out.println(s1);
		char[] chars = s1.toCharArray();
//		predefine Method
		System.out.println(java.util.Arrays.toString(chars));
	}
}
