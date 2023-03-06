package com.akash;
/*
Print reversing content of the array
Output
initial content
10,40,4,50,125,5,800,6,60,9,100,12,
final content
12,100,9,60,6,800,5,125,50,4,40,10,12,

 */
public class A60 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};
//		index By		  0   1    2   3   4  5
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
		System.out.println();
		
		for(int i = 0; i < elements.length / 2; i++) {
			int temp = elements[i];
			elements[i] = elements[elements.length - 1 - i];
			elements[elements.length - 1 - i] = temp;
		}
		
		System.out.println("final content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
	}
}
