package com.akash;
/*
Print insert secondArray elements into firstArray 3th index onwards
Output
initial content
10,40,4,50,125,5,800,6,60,9,100,12,
final content
10,40,4,3,6,500,45,50,125,5,800,6,60,9,100,12,

 */
public class A59 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] firstArray = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};
//		index By		  0   1    2   3   4  5
		int[] secondArray = {3, 6, 500, 45};
//		index By		  0   1    2   3   
//		add elements2 to elemnets1
		System.out.println("initial content");
		for(int i = 0; i < firstArray.length; i++) {
			System.out.print(firstArray[i] + ",");
		}
		System.out.println();
//		insert secondArray elements into firstArray 3th index onwards
		int[] temp = firstArray;
		firstArray = new int[temp.length + secondArray.length];
		for(int i = 0; i < temp.length; i++) {
			firstArray[i] = temp[i];
		}
		
		for(int i = firstArray.length - 1; i > 6; i--) {
			firstArray[i] = firstArray[i - 4];
		}		
		for(int i = 3, j = 0; j < secondArray.length; i++, j++) {
			firstArray[i] = secondArray[j];
		}
		System.out.println("final content");
		for(int i = 0; i < firstArray.length; i++) {
			System.out.print(firstArray[i] + ",");
		}
	}
}
