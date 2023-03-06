package com.akash;
/*
How to swap two index value using temp variable.
Output
initial content
10,40,4,50,125,5,800,6,
final content
10,40,5,50,125,4,800,6,


 */
public class A32 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6};
//		index By		  0   1    2   3   4  5
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
		System.out.println();
//		swap two index value
		int temp = elements[2];
		elements[2] = elements[5];
		elements[5] = temp;
		System.out.println("final content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
	}
}
