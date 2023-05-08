package com.akash;

import java.util.Scanner;

// Write a program to reverse a string first half separatery and 
// 2nd half separately By using algorithm
public class M41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s1 = sc.next();
        String s2 = reverse(s1.substring(0, s1.length() / 2)) + reverse(s1.substring(s1.length() / 2, s1.length()));
        System.out.println("Given String is " + s1);
        System.out.println("Reverse String is " + s2);
    }
    private static String reverse(String s1) {
//    	System.out.println("from reverse: " + s1);
    	if(s1.length() == 0) {
    		return "";
    	}
    	return s1.charAt(s1.length() -1) + reverse(s1.substring(0, s1.length() - 1));
    }
}