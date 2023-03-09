package com.akash;
//Q25. Develop a program to print 20 prime numbers from 100.
/*
Output
1
2
3
5
7
11
13
17
19
 */
public class Q25 {
	public static void main(String[] args) {
		int num = 100;
		int count = 0;
		for(int i = 1; i <= 100; i++) {
			count = 0;
			for(int j = 2; j <= i / 2; j++) {
				if(i % j == 0) {
					count++;
					break;
				}
			}
			if(count == 0 && num != 0 && i <= 20) {
				System.out.println(i);
			}
		}
	}
}
