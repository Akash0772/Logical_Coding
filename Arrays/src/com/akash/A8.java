package com.akash;
/*
Print the elements initialization in array starting 0 alternating read by for each loop
Output
10
15
25
 */
public class A8 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 15, 40, 25, 5};
//		index By		  0   1    2   3   4  5
		for(int i = 0; i < elements.length; i += 2) {
			System.out.println(elements[i]);
		}
	}
}
