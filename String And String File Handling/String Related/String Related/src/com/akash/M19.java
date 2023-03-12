package com.akash;
/*
Output
20
17
 */
public class M19 {
	public static void main(String[] args) {
		String s1 = "java is better than apple";
//		             0123
//		right to left
		int i = s1.lastIndexOf('a');
		System.out.println(i);
		int j = s1.lastIndexOf('a', i - 1);
		System.out.println(j);
	}
}
