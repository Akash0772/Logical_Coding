package com.akash;
/*
Print the element initialization in array by for each loop
Output
10
40
15
40
25
5
 */
public class A4 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 15, 40, 25, 5};
//		index By		  0   1    2   3   4  5
		for(int element : elements) {
			System.out.println(element);
		}
	}
}
