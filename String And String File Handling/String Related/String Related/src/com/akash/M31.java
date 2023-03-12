package com.akash;
import java.util.Scanner;
/*
Output
enter a line of words
abc test hello123
hello123
 */
public class M31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a line of words");
		String s1 = sc.nextLine();
		int longestWordLength = 0, longestWordFromIndex = 0, longestWordEndIndex = s1.length() - 1;
		int fromIndex = 0;
		int toIndex = s1.indexOf(' ');
		while(toIndex != -1) {
			if(longestWordLength < (toIndex - fromIndex)) {
				longestWordLength = (toIndex - fromIndex);
				longestWordFromIndex = fromIndex;
				longestWordEndIndex = toIndex;
			}
			fromIndex = toIndex + 1;
			toIndex = s1.indexOf(' ', fromIndex);
		}
		if(longestWordLength < (s1.length() - fromIndex)) {
			longestWordFromIndex = fromIndex;
			longestWordEndIndex = s1.length();
		}
		String longestWord = s1.substring(longestWordFromIndex, longestWordEndIndex);
		System.out.println(longestWord);
	}
}
