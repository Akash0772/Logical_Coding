package com.akash;
/*
Print the elements initialization in array starting 1 alternating read by for each loop
Output
40
40
5
 */
public class A7 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 15, 40, 25, 5};
//		index By		  0   1    2   3   4  5
		for(int i = 1; i < elements.length; i += 2) {
			System.out.println(elements[i]);
		}
	}
}
