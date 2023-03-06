package com.akash;
/*
Print the local replace value given elements in the array
Output
initial content
40,4,50,125,5,800,6,
final content
40,9,50,125,3,800,6,


 */
public class A30 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6};
//		index By		  0   1    2   3   4  5
		System.out.println("initial content");
		for(int i = 1; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
		System.out.println();
		elements[2] = 9;
		elements[5] = 3;
		System.out.println("final content");
		for(int i = 1; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
	}
}
