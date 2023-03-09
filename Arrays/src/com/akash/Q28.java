package com.akash;
import java.util.Scanner;
// Q28. Find out an index of a specified element from a given array ?
public class Q28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter arrays element");
		int arr[] = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
//		For each loop logic
		System.out.println("Even index array element ");
		for(int elements : arr) {
			System.out.print(elements + ",");
		}
	}
}
