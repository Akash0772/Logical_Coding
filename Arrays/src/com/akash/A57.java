package com.akash;
/*
Print add elements2 to elemnets1 
Output
initial content
10,40,4,50,125,5,800,6,60,9,100,12,
final content
10,40,4,50,125,5,800,6,60,9,100,12,3,6,500,45,

 */
public class A57 {
	public static void main(String[] args) {
//	  initialization in arrays
		int[] elements1 = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};
//		index By		  0   1    2   3   4  5
		int[] elements2 = {3, 6, 500, 45};
//		index By		  0   1    2   3   
//		add elements2 to elemnets1
		System.out.println("initial content");
		for(int i = 0; i < elements1.length; i++) {
			System.out.print(elements1[i] + ",");
		}
		System.out.println();
//		adding new two element (500) and (600) into array
		int[] temp = elements1;
		elements1 = new int[temp.length + elements2.length];
		for(int i = 0; i < temp.length; i++) {
			elements1[i] = temp[i];
		}
		for(int i = temp.length, j = 0; i < elements1.length; i++, j++) {
			elements1[i] = elements2[j];
		}
		System.out.println("final content");
		for(int i = 0; i < elements1.length; i++) {
			System.out.print(elements1[i] + ",");
		}
	}
}
