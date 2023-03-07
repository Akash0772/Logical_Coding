package com.akash;
import java.util.Scanner;
// Q1. Find the sum of all given elements from an int array ?
public class Q1 {
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
//		initialization 
		int sum = 0;
//		print the store arrays sum
		for(int i = 0; i < size; i++) {
			sum += arr[i];
		}
		System.out.println("Arrays length " + arr.length);
		System.out.println("Arrays given elements total sum " + sum);
	}
}
