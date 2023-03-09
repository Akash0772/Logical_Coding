package com.akash;
import java.util.Scanner;
// Q29. Swap two given indexed elements from the array ?
public class Q29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arrays two element");
		int arr[] = new int[2];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
//		Swap logic
		System.out.println("Swap index initial array element ");
		System.out.print(arr[0] + " , " + arr[arr.length - 1]);
		System.out.println();
		int temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length -1] = temp;
		System.out.println("Swap index final array element");
		System.out.print(arr[0] + " , " + arr[arr.length - 1]);
	}
}
