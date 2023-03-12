package com.akash;
/*
Output
2
1
3
 */
public class M14 {
	public static void main(String[] args) {
		String s1 = "java";
//		             0123
		int i = s1.indexOf('v');
		System.out.println(i);
		int j = s1.indexOf('a');
		System.out.println(j);
		int k = s1.indexOf('a', j + 1);
		System.out.println(k);
	}
}
