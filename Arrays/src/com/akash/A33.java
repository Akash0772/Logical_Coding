package com.akash;
/*
How to swap two index value without using temp variable.
Output
initial content
10,40,4,50,125,5,800,6,
final content
6,40,4,50,125,5,800,10,


 */
public class A33 {
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
		elements[0] = elements[0] + elements[elements.length - 1];
		elements[elements.length - 1] = elements[0] - elements[elements.length - 1];
		elements[0] = elements[0] - elements[elements.length - 1];
		
		System.out.println("final content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
	}
}
