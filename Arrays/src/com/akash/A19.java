package com.akash;
/*
Find the average in the given array
Output
Average in given array 22.0
Average in given array 22.5

 */
public class A19 {
	public static void main(String[] args) {
//	  initialization in arrays
		int sum = 0;
		int[] elements = {10, 40, 15, 40, 25, 5};
//		index By		  0   1    2   3   4  5
		for(int i = 0; i < elements.length; i++) {
//			sum = sum + elements[i];
			sum += elements[i];
		}
		double avg1 = sum / elements.length;
		double avg2 = (double) sum / elements.length;
		System.out.println("Average in given array " + avg1);
		System.out.println("Average in given array " + avg2);
	}
}
