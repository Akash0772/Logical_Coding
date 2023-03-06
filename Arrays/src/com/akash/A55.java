package com.akash;
/*
Print adding new element (500) into array in insert by last index
Output
initial content
10,40,4,50,125,5,800,6,60,9,100,12,
final content
10,40,4,50,125,5,800,6,60,9,100,12,500,

 */
public class A55 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};
//		index By		  0   1    2   3   4  5
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
		System.out.println();
//		adding new element (500) into array
		int[] temp = elements;
		elements = new int[temp.length + 1];
		for(int i = 0; i < temp.length; i++) {
			elements[i] = temp[i];
		}
		elements[elements.length - 1] = 500;
		System.out.println("final content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
	}
}
