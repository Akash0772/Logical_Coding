package com.akash;
import java.util.Scanner;
// Q3. Find the maximum element from the given int array ? 
public class Q3 {
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
//		initialization and store Minimum integer value
		int max = Integer.MIN_VALUE;
//		print the store array minimum value
		for(int i = 0; i < size; i++) {
			if(max < arr[i] ) {
//				System.out.print(max);
				max = arr[i];
			}
		}
		System.out.println("Arrays length " + arr.length);
		System.out.println("Arrays given elements total max " + max);
	}
}
