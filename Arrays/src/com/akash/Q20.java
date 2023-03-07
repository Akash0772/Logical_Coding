package com.akash;
import java.util.Scanner;
// Q20. Find out the average value from a second half of given int array ?
public class Q20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter arrays element");
		int arr[] = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		int count = 0;
		for(int i = size / 2; i < size; i++) {
			count++;
			sum += arr[i];
		}
		double avg = sum / count;
		System.out.println("Second Half avg value of array element " + avg);
	}
}
