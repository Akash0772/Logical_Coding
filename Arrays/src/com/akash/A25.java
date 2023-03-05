package com.akash;
/*
Find the minimum value given elements in the array
Output
Minimum value is 5


 */
public class A25 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 15, 40, 25, 5};
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
