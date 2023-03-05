package com.akash;
/*
Print the element index 6 in the given array
Output
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
	at com.akash.A17.main(A17.java:14)

 */
public class A17 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 15, 40, 25, 5};
//		index By		  0   1    2   3   4  5
		System.out.println(elements[6]);
	}
}
