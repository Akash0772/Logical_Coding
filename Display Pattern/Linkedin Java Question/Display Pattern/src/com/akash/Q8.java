package com.akash;
import java.util.Scanner;
// Mirror Right-angled Triangle of whole numbers
/*
Output
Enter a Number
5
Print Mirror Right-angled Triangle of whole numbers
        1 
      1 2 
    1 2 3 
  1 2 3 4 
1 2 3 4 5    
 */
public class Q8 {
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Print Mirror Right-angled Triangle of whole numbers");
		for(int i = 1; i <= n ; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
