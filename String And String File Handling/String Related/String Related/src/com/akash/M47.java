package com.akash;

import java.util.Arrays;
import java.util.Scanner;

// Write a java program to find the duplicate words and their number of occurrences in a string ?
public class M47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
//		String[] words = s1.split("\\s");
//		String[] words = s1.split(" ");
		String[] words = s1.split("\\s+");
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
		int count = 1;
		String prevWord = words[0], currentWord;
		for(int i = 1; i < words.length; i++) {
			currentWord = words[i];
			if(currentWord.equals(prevWord)) {
				count++;
			}else {
				System.out.println(prevWord + ":" + count);
				prevWord = currentWord;
				count = 1;
			}
		}
		System.out.println(prevWord + ":" + count);
	}
}
