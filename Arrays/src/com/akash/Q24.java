package com.akash;
import java.util.Scanner;
// Q24. Read only even indexed elements from an array ?
public class Q24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter arrays element");
		int arr[] = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
//		reverse logic
		System.out.println("Even index array element ");
		for(int i = 0; i <= size; i++) {
			if(i % 2 == 0) {
				System.out.print(arr[i] + ",");
			}
		}
	}
}
