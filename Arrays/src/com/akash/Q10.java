package com.akash;
import java.util.Scanner;
// Q10. Find out the maximum value from all odd indexed elements from a given int array ?
public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		System.out.println("Enter arrays element");
		int arr[] = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int max  = Integer.MIN_VALUE;
		for(int i = 0; i < size; i++) {
			if(i % 2 != 0) {
				if(max < arr[i]) {
					max = arr[i];
				}
			}
		}
		System.out.println("Odd index maximum value of array element " + max);
	}
}
