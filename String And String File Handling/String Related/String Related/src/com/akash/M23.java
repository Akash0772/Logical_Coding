package com.akash;
/*
Output
java is avilable @ 3 time in core java is base to all java and JEE in a java echo than system

 */
public class M23 {
	public static void main(String[] args) {
		String s1 = "core java is base to all java and JEE in a java echo than system";
//		             0123
//		left to right
		int i = s1.indexOf("java");
		int words = 0;
//		using while loop
		while(i != -1) {
			words++;
			i = s1.indexOf("java", i + 1);
		}
		System.out.println("java is avilable @ " + words + " time in " + s1);
	}
}
