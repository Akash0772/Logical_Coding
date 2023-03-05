package com.akash;
/*
Print the reverse element alternating and start by last element in the array
Output
5
40
40
 */
public class A12 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 15, 40, 25, 5};
//		index By		  0   1    2   3   4  5
		for(int i = elements.length - 1; i >= 0; i -= 2) {
			System.out.println(elements[i]);
		}
	}
}
