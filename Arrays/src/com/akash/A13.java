package com.akash;
/*
Print the reverse element alternating the last element in the array
Output
25
15
10
 */
public class A13 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 15, 40, 25, 5};
//		index By		  0   1    2   3   4  5
		for(int i = elements.length - 2; i >= 0; i -= 2) {
			System.out.println(elements[i]);
		}
	}
}
