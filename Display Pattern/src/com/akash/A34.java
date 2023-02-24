package com.akash;
/*
p
qr
stu
vwxy
zabcd
efghij
klmnopq
rstuvwxy
 */
public class A34 {
	public static void main(String[] args) {
		char ch = 'p';
		for(int i = 1; i <= 8; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(ch);
				if(ch == 'z') {
					ch = 'z' - 26;
				}
				ch++;
			}
			System.out.println();
		}
	}
}
