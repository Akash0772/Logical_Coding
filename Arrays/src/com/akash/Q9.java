package com.akash;
import java.util.Scanner;
// Q9. Find out the minimum value from all even indexed elements from a given int array ?
public class Q9 {
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
		for(int i = 0; i < size; i++) {
			if(i % 2 == 0) {
				if(min > arr[i]) {
					min = arr[i];
				}
			}
		}
		System.out.println("Even index minimum value of array element " + min);
	}
}
