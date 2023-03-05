package com.akash;
/*
Print the booth middle element in the given array
Output
15
40
 */
public class A15 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 15, 40, 25, 5};
//		index By		  0   1    2   3   4  5
		System.out.println(elements[elements.length / 2 - 1]);
		System.out.println(elements[elements.length / 2]);
	}
}
