package com.akash;
/*
Output
1
3
17
20
 */
public class M15 {
	public static void main(String[] args) {
		String s1 = "java is better than apple";
//		             0123
		int i = s1.indexOf('a');
		System.out.println(i);
		int j = s1.indexOf('a', i + 1);
		System.out.println(j);
		int k = s1.indexOf('a', j + 1);
		System.out.println(k);
		int l = s1.indexOf('a', k + 1);
		System.out.println(l);
	}
}
