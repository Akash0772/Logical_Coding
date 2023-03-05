package com.akash;
/*
Find the minimum value given elements in the array
Output
Minimum value is 4


 */
public class A26 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 15, 7, 25, 5, 8, 4};
//		index By		  0   1    2   3   4  5
		int minVal = elements[0];
		for(int i = 1; i < elements.length; i++) {
			if(elements[i] < minVal) {
				minVal = elements[i];
			}
		}
		System.out.println("Minimum value is " + minVal);
	}
}
