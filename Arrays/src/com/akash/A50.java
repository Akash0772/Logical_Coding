package com.akash;
/*
Print removed ranges of elements
Output
initial content
10,40,4,50,125,5,800,6,60,9,100,12,
final content
10,40,4,50,125,12,

 */
public class A50 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};
//		index By		  0   1    2   3   4  5
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
		System.out.println();
// 		removed index no. 5 to 10 logic
//		lift shift by 4 from index number 2
		for(int i = 5; i < elements.length - 6; i++) {
			elements[i] = elements[i + 6];
		}
		
		int[] temp = elements;
		elements = new int[temp.length - 6];
		for(int i = 0; i < elements.length; i++) {
			elements[i] = temp[i];
		}
		System.out.println("final content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
	}
}
