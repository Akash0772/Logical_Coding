package com.akash;
import java.util.Scanner;
// 7. Find out the sum of all even indexed elements from a given int array ?
public class Q7 {
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
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("Even sum of array element " + sum);
	}
}
