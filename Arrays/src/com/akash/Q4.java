package com.akash;
import java.util.Scanner;
// Q4. Find the 2nd minimum element from the given int array ? 
public class Q4 {
	public static void main(String[] args) {
		System.out.println("Enter the array size");
		Scanner sc = new Scanner(System.in);
//		initialization arrays size by users
		int size = 0;
		if(sc.hasNextInt()) {
			size = sc.nextInt();
		}
		System.out.println("Enter a array values");
		int[] arr = new int[size];

//		store a values in array
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
//		System.out.println("Initial Content");
//		using for each loop
		for(int element: arr) {
//			System.out.print(element + ",");
		}
		System.out.println();
// 		Short array by using Bubble short
//		System.out.println("Final value");
//		Print 2nd minimum value
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length ; j++) {
				int temp = 0;
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
//			System.out.print(arr[i] + ",");
		}
		System.out.println("Second minimum value is " + arr[1]);
	}
}
