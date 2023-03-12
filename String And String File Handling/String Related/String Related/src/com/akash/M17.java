package com.akash;
/*
Output
1
3
17
20
 */
public class M17 {
	public static void main(String[] args) {
		String s1 = "java is better than apple";
//		             0123
//	using while loop
		int i = s1.indexOf('a');
		while(i != -1) {
			System.out.println(i);
			i = s1.indexOf('a', i + 1);
		}
	}
}
