package com.akash;
/*
Find the maximum value in the first Half and Second Half given array
Output
bigger element in the 1nd half


 */
public class A23 {
	public static void main(String[] args) {
//	  initialization in arrays
		int leftSum = 0;
		int rightSum = 0;
		int[] elements = {60, 40, 15, 40, 25, 5};
//		index By		  0   1    2   3   4  5
		for(int i = 0; i < elements.length / 2; i++) {
//			sum = sum + elements[i];
			leftSum += elements[i];
		}
		for(int i = elements.length / 2; i < elements.length; i++) {
//			sum = sum + elements[i];
			rightSum += elements[i];
		}
		double leftAvg = leftSum / (elements.length / 2);
		double rightAvg = (double) rightSum / (elements.length / 2);
		System.out.println(leftAvg < rightAvg ? "bigger element in the 2nd half" : "bigger element in the 1nd half");
	}
}
