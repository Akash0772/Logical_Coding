package com.akash;
import java.util.Scanner;
// Right-angled triangle of number from 1 to n
/*
Output
Enter a Number
5
Print Right-angled triangle of number from 1 to n
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5    
 */
public class Q7 {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Print Right-angled triangle of number from 1 to n");
		for(int i = 1; i <= n ; i++) {
//			for(int j = 1; j <= n - i; j++) {
//				System.out.print("  ");
//			}
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
