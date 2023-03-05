package com.akash;
/*
Find the sum in given array
Output
All elements sum is 135

 */
public class A18 {
	public static void main(String[] args) {
//	  initialization in arrays
		int sum = 0;
		int[] elements = {10, 40, 15, 40, 25, 5};
//		index By		  0   1    2   3   4  5
		for(int i = 0; i < elements.length; i++) {
//			sum = sum + elements[i];
			sum += elements[i];
		}
		System.out.println("All elements sum is " + sum);
	}
}
