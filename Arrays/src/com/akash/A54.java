package com.akash;
/*
Print insert 4th index and 5 index
Output
initial content
10,40,4,50,125,5,800,6,60,9,100,12,
final content
10,40,4,50,500,600,125,5,800,6,60,9,100,12,

 */
public class A54 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};
//		index By		  0   1    2   3   4  5
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
		System.out.println();
//		insert 500 @ index = 4 and 600 @ index = 5
		int[] temp = elements;
		elements = new int[temp.length + 2];
		for(int i = 0; i < temp.length; i++) {
			elements[i] = temp[i];
		}
		for(int i = elements.length - 1; i > 5; i--) {
			elements[i] = elements[i - 2];
		}
		elements[4] = 500;
		elements[5] = 600;
		System.out.println("final content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
	}
}
