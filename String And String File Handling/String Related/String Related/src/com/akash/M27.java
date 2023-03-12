package com.akash;
/*
Output
abc xyz
abc
xyz
 */
public class M27 {
	public static void main(String[] args) {
		String s1 = "abc xyz";
//		             0123
		String s2 = s1.substring(0, 3);
		String s3 = s1.substring(4);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
