package com.akash;
/*
Print removed 4th, 5th elements index of 3 and 4 elements
Output
initial content
10,40,4,50,125,5,800,6,60,9,100,12,
final content
10,40,4,5,800,6,60,9,100,12,

 */
public class A48 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};
//		index By		  0   1    2   3   4  5
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
		System.out.println();
// 		removed 4th, 5th elements index of 3 and 4 logic
		for(int i = 3; i < elements.length - 2; i++) {
			elements[i] = elements[i + 2];
		}
		
		int[] temp = elements;
		elements = new int[temp.length - 2];
		for(int i = 0; i < elements.length; i++) {
			elements[i] = temp[i];
		}
		System.out.println("final content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
	}
}
