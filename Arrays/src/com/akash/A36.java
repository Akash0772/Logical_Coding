package com.akash;
/*
Print left shift by one other logic
initial content
10,40,4,50,125,5,800,6,
final content
40,4,50,125,5,800,6,6,


 */
public class A36 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6};
//		index By		  0   1    2   3   4  5
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
		System.out.println();
//		left shift by one
		for(int i = 1; i < elements.length; i++) {
			elements[i - 1] = elements[i];
		}
		
		System.out.println("final content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
	}
}
