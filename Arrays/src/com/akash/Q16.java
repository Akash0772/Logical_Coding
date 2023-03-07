package com.akash;
import java.util.Scanner;
// Q16. Find out the minimum value from a second half of given int array?
public class Q16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter arrays element");
		int arr[] = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int min  = Integer.MAX_VALUE;

		for(int i = size / 2; i < size; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Second Half sum value of array element " + min);
	}
}
