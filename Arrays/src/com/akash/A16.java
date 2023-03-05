package com.akash;
/*
Print the element index -1 in the given array
Output
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6
	at com.akash.A16.main(A16.java:13)

 */
public class A16 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 15, 40, 25, 5};
//		index By		  0   1    2   3   4  5
		System.out.println(elements[-1]);
	}
}
