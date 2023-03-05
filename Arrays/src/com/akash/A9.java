package com.akash;
/*
Print the reverse element in the array
Output
5
25
40
15
40
10
 */
public class A9 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 15, 40, 25, 5};
//		index By		  0   1    2   3   4  5
		for(int i = elements.length - 1; i >= 0; i--) {
			System.out.println(elements[i]);
		}
	}
}
