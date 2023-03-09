package com.akash;
/*
Q11. Print Java for multiples of 4 and print Python 
     for multiples of 5 and if the number is multiple 
     of 4 and also 5,then print Both. Continue till 100.
*/
/*
Output
Enter the two number
1
20
Not
Not
Not
java
J2EE
Not
Not
java
Not
J2EE
Not
java
Not
Not
J2EE
java
Not
Not
Not
aman
 */
import java.util.Scanner;
public class Q11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two number");
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i = start; i <= end; i++) {
			if(i % 4 == 0 && i % 5 == 0) {
				System.out.println("aman");
				}else if(i % 4 == 0) {
					System.out.println("java");
				}else if(i % 5 == 0) {
					System.out.println("J2EE");
				}else {
				System.out.println("Not");
			}
		}
	}
}