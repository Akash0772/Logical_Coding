package com.akash;
// Print I Heart U
public class I_Love_U {
	public static void main(String[] args) {
		int m = 5;
		for(int l = 1; l <= m; l++) {
			for(int j = 1; j <= m; j++) {
				if(l == 1 || l == m || j == l / 2 + 3) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		int n = 2;
		for(int i = 1, element = 1; i <= n; i++, element += 2) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= element; j++) {
				System.out.print("* ");
			}
			for(int j = 1; j <= n - i; j++) {
				System.out.print("    ");
			}
			for(int j = 1; j <= element; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		int k = 6;
		for(int i = k; i >= 1; i--) {
			for(int j = 1; j <= k - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1; i <= m; i++) {
			for(int j = 1; j <= m; j++) {
				if(j == 1 || j == m  || i == m) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
