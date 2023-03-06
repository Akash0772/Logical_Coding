package com.akash;
/*
Print right shift by two
Output
initial content
10,40,4,50,125,5,800,6,60,9,100,12,
final content
10,40,10,40,4,50,125,5,800,6,60,9,


 */
public class A44 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};
//		index By		  0   1    2   3   4  5
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
		System.out.println();
// 		right shift by two logic
		for(int i = elements.length - 3; i >= 0; i--) {
			elements[i + 2] = elements[i];
		}
		
		System.out.println("final content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
	}
}
