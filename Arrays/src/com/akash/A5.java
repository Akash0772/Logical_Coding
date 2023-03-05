package com.akash;
/*
Print the first Half elements initialization in array by for each loop
Output
10
40
15
 */
public class A5 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 15, 40, 25, 5};
//		index By		  0   1    2   3   4  5
		for(int i = 0; i < elements.length / 2; i++) {
			System.out.println(elements[i]);
		}
	}
}
