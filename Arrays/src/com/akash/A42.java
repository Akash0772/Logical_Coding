package com.akash;
/*
Print left shift by two
initial content
10,40,4,50,125,5,800,6,60,9,100,12,
final content
4,50,125,5,800,6,60,9,100,12,100,12,


 */
public class A42 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};
//		index By		  0   1    2   3   4  5
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
		System.out.println();
// 		left shift two logic
		for(int i = 0; i < elements.length - 2; i++) {
			elements[i] = elements[i + 2];
		}
		
		System.out.println("final content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
	}
}
