package com.akash;
import java.util.Scanner;
// Q22. Read first half of the elements in the reverse direction from an array ?
public class Q22 {
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
		System.out.println("First Half reverse array element ");
		for(int i = (size - 1) / 2; i >= 0; i--) {
			System.out.print(arr[i] + ",");
		}
	}
}
