package com.akash;

import java.util.Scanner;

/*
Output
enter a line of words
abc xyz 123 hello java done end btm
abc
xyz
123
hello
java
done
end
btm
 */
public class M29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String s1 = "abc xyz 123 hello java done end btm";
//		             0123
		System.out.println("enter a line of words");
		String s1 = sc.nextLine();
		int fromIndex = 0;
		int toIndex = s1.indexOf(' ');
		String word;
		while(toIndex != -1) {
			word = s1.substring(fromIndex, toIndex);
			System.out.println(word);
			fromIndex = toIndex + 1;
			toIndex = s1.indexOf(' ', fromIndex);
		}
//		System.out.println(fromIndex);
		word = s1.substring(fromIndex);
		System.out.println(word);
	}
}
