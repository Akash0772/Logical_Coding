package com.akash;
/*
Find the average value in the second Half given array
Output
Average in given array 23.0
Average in given array 23.333333333333332


 */
public class A21 {
	public static void main(String[] args) {
//	  initialization in arrays
		int sum = 0;
		int[] elements = {10, 40, 15, 40, 25, 5};
//		index By		  0   1    2   3   4  5
		for(int i = elements.length / 2; i < elements.length; i++) {
//			sum = sum + elements[i];
			sum += elements[i];
		}
		double avg1 = sum / (elements.length / 2);
		double avg2 = (double) sum / (elements.length / 2);
		System.out.println("Average in given array " + avg1);
		System.out.println("Average in given array " + avg2);
	}
}
