package com.akash;

import java.util.Scanner;

// One and more than spaces
public class M35 {
	public static void main(String[] args) {
		System.out.println("enter a line of word");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
//		btm is        java            123    xyz   java
		int fromIndex = 0;
		int spaceIndex = s1.indexOf(' ');
		int commaIndex = s1.indexOf(',');
		int semiColonIndex = s1.indexOf(';');
		int dotIndex = s1.indexOf('.');
		int toIndex = findMinAmong(spaceIndex, commaIndex, semiColonIndex, dotIndex);
		String word;
		while(toIndex != -1) {
			word = s1.substring(fromIndex, toIndex);
			System.out.println(word);
			toIndex = trimLeadingDelims(s1, toIndex);
			fromIndex = toIndex + 1;
			spaceIndex = s1.indexOf(' ', fromIndex);
			commaIndex = s1.indexOf(',', fromIndex);
			semiColonIndex = s1.indexOf(';', fromIndex);
			dotIndex = s1.indexOf('.', fromIndex);
			toIndex = findMinAmong(spaceIndex, commaIndex, semiColonIndex, dotIndex);
		}
		word = s1.substring(fromIndex);
		System.out.println(word);
	}
	static int findMinAmong(int commaIndex, int semiColonIndex, int dotIndex, int spaceIndex) {
		int[] numbers = {commaIndex, semiColonIndex, dotIndex, spaceIndex};
		int min = -1;
		for(int i = 0; i < numbers.length; i++) {
			if(min == -1) {
				if(numbers[i] != -1) {
					min = numbers[i];
				}
			}else if(numbers[i] != -1 && numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}
	static int trimLeadingDelims(String s1, int toIndex) {
		char c1 = s1.charAt(toIndex + 1);
		while(c1 == ' ' || c1 == ',' || c1 == ';' || c1 == '.') {
			++toIndex;
			c1 = s1.charAt(toIndex + 1);
		}
		return toIndex;
	}
}
