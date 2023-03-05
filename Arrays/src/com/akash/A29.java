package com.akash;
/*
Find the maximum value given elements in the array
Output
Maximum value is 800


 */
public class A29 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6};
//		index By		  0   1    2   3   4  5
		int maxVal = elements[0];
		for(int i = 1; i < elements.length; i++) {
			if(elements[i] > maxVal) {
				maxVal = elements[i];
			}
		}
		System.out.println("Maximum value is " + maxVal);
	}
}
