package com.akash;
import java.util.Scanner;
//Q18. Assume the total number of digits in a given number is even. Reverse only first half of the given number.
/*
Output
Enter a value 8 digit
12345678
12345678
43215678
 */
public class Q18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value 8 digit");
		int num = sc.nextInt();
		int temp = num;
		int digitCount = 0;
		while(temp != 0) {
			digitCount++;
			temp = temp / 10;
		}
		int factor = 1;
		for(int i = 1; i <= (digitCount / 2); i++) {
			factor = factor * 10;
		}
		int firstHalf = num / factor; //4590
		int secondHalf = num % factor; //1234
		int revFirstHalf = 0; //4590
		int revDigit;
		while(firstHalf != 0) {
			revDigit = firstHalf % 10;
			revFirstHalf = (revFirstHalf * 10) + revDigit;
			firstHalf = firstHalf / 10;
			//System.out.println(revDigit);
 		} 
		int revFirstHalf1 = revFirstHalf  * 10000 + secondHalf;
		System.out.println(num);
		System.out.println(revFirstHalf1);
	}
}