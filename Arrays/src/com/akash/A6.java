package com.akash;
/*
Print the second Half elements initialization in array by for each loop
Output
40
25
5
 */
public class A6 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 15, 40, 25, 5};
//		index By		  0   1    2   3   4  5
		for(int i = elements.length / 2; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
	}
}
