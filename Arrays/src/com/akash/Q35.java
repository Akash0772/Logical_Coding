package com.akash;
import java.util.Scanner;
// Q35. Swap odd indexed elements with its immediate next even indexed elements of given array?
public class Q35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arrays size");
		int size = 0;
		if(sc.hasNext()) {
			size = sc.nextInt();
		}
		System.out.println("Enter array elemement");
		int arr[] = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Initial array element ");
		for(int elements: arr) {
			System.out.print(elements + ", ");
		}
		System.out.println();
		System.out.println("Reverse final array element");
		int first = 0;
		int last = arr.length - 1;
//		Reverse swap logic
		while(first < last) {
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			
			first++;
			last--;
		}
//		Odd index Reverse
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 != 0 ) {
				System.out.print(arr[i] + ", ");
			}
		}
	}
}
