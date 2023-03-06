package com.akash;
/*
Print reversing content firstHalf of the array without using secondHalfHalf
Output
initial content
10,40,4,50,125,5,800,6,60,9,100,12,
final content
5,125,50,4,40,10,800,6,60,9,100,12,

 */
public class A62 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};
//		index By		  0   1    2   3   4  5
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
		System.out.println();
		
		for(int i = 0; i < elements.length / 4; i++) {
			elements[i] = elements[i] + elements[(elements.length / 2) - 1 - i];
			elements[(elements.length / 2) - 1 - i] = elements[i] - elements[(elements.length / 2) - 1 - i];
			elements[i] = elements[i] - elements[(elements.length / 2) - 1 - i];
		}
		
		System.out.println("final content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
	}
}
