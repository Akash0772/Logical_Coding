package com.akash;
/*
Print right shift by one logic
initial content
10,40,4,50,125,5,800,6,
final content
10,10,10,10,10,10,10,10,


 */
public class A37 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements = {10, 40, 4, 50, 125, 5, 800, 6};
//		index By		  0   1    2   3   4  5
		System.out.println("initial content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
		System.out.println();
//		right shift by one
		for(int i = 0; i < elements.length - 1; i++) {
			elements[i + 1] = elements[i];
		}
		
		System.out.println("final content");
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
	}
}
