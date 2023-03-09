package com.akash;
//Q12. Find out whether digits are in raising order or not in a given number?
import java.util.Scanner;
public class Q12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size in array ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < size; i++) {
			if(i < arr[i]) {
				System.out.println("not");
			}else {
				System.out.println("Yes");
			}
		}
	}
}
