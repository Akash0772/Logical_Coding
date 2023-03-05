package com.akash;
/*
Find the average value in the first Half given array
Output
Average in given array 21.0
Average in given array 21.666666666666668


 */
public class A20 {
	public static void main(String[] args) {
//	  initialization in arrays
		int sum = 0;
		int[] elements = {10, 40, 15, 40, 25, 5};
//		index By		  0   1    2   3   4  5
		for(int i = 0; i < elements.length / 2; i++) {
//			sum = sum + elements[i];
			sum += elements[i];
		}
		double avg1 = sum / (elements.length / 2);
		double avg2 = (double) sum / (elements.length / 2);
		System.out.println("Average in given array " + avg1);
		System.out.println("Average in given array " + avg2);
	}
}
