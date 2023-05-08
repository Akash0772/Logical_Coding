package com.akash;
/*
Output
java is avilable @ 5
java is avilable @ 25
java is avilable @ 43
 */
public class M22 {
	public static void main(String[] args) {
		String s1 = "core java is base to all java and JEE in a java echo than system";
//		             0123
//		left to right
		int i = s1.indexOf("java");
//		using while loop
		while(i != -1) {
			System.out.println("java is avilable @ " + i);
			i = s1.indexOf("java", i + 1);
		}
	}
}
