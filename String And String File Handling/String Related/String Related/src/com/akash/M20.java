package com.akash;
/*
Output
20
17
3
1
 */
public class M20 {
	public static void main(String[] args) {
		String s1 = "java is better than apple";
//		             0123
//		right to left
		int i = s1.lastIndexOf('a');
//		using while loop
		while(i != -1) {
			System.out.println(i);
			i = s1.lastIndexOf('a', i - 1);
		}
	}
}
