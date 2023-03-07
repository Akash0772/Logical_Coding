package com.akash;
import java.util.Scanner;
// 6. Find the average value of an int array ?
public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter arrays element");
		int arr[] = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int sum  = 0;
		for(int i = 0; i < size; i++) {
			sum += arr[i];
		}
//		find average value in array
//		double avg = sum / arr.length;
		double avg = sum / size;
		System.out.println("Array average value is " + avg);
	}
}
