package com.akash;
/*
Print the first element and last element in the given array
Output
First element 10
Last element 5
 */
public class A14 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 15, 40, 25, 5};
//		index By		  0   1    2   3   4  5
		System.out.println("First element " + elements[0]);
		System.out.println("Last element " + elements[elements.length - 1]);
	}
}
