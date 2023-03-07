package com.akash;
import java.util.Scanner;
// Q23. Read second half of the elements in the reverse direction from an array ?
public class Q23 {
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
		System.out.println("Second Half reverse array element ");
		for(int i = (size - 1); i >= (size / 2); i--) {
			System.out.print(arr[i] + ",");
		}
	}
}
