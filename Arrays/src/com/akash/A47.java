package com.akash;
/*
Print removed 4th elements index of 3 and remove duplicate
Output
initial content
10,40,4,50,125,5,800,6,60,9,100,12,
final content
10,40,4,125,5,800,6,60,9,100,12,

 */
public class A47 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};
//		index By		  0   1    2   3   4  5
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
		System.out.println();
// 		right rotate by two logic
		for(int i = 3; i < elements.length - 1; i++) {
			elements[i] = elements[i + 1];
		}
		
		int[] temp = elements;
		elements = new int[temp.length - 1];
		for(int i = 0; i < elements.length; i++) {
			elements[i] = temp[i];
		}
		System.out.println("final content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
	}
}
