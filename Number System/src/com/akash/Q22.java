package com.akash;
//Q22. Develop a program to print initial 20 prime numbers? 
/*
Output
Enter a number
100
1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 
 */
import java.util.Scanner;
public class Q22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= num; i++) {
			count = 0;
			for(int j = 2; j <= i / 2; j++) {
				if(i % j == 0){
					count++;
					break;
				}
			}
			if(count == 0) {
				System.out.print(i + ", ");
			}
		}
	}
}