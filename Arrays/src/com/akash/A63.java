package com.akash;
/*
Print reversing content seconHalf of the array without using firstHalfHalf
Output
initial content
10,40,4,50,125,5,800,6,60,9,100,12,
final content
10,40,4,50,125,5,12,100,9,60,6,800,

 */
public class A63 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};
//		index By		  0   1    2   3   4  5
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
		System.out.println();
		
		int middle = (elements.length / 2) + (elements.length - (elements.length / 2)) / 2;
		for(int i = (elements.length / 2), j = 0; i < middle; i++, j++) {
			elements[i] = elements[i] + elements[elements.length - 1 - j];
			elements[elements.length  - 1 - j] = elements[i] - elements[elements.length - 1 - j];
			elements[i] = elements[i] - elements[elements.length - 1 - j];
		}
		
		System.out.println("final content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
	}
}
