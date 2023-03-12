package com.akash;
/*
Output
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 5
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
	at java.base/java.lang.String.charAt(String.java:1512)
	at com.akash.M3.main(M3.java:12)
 */
public class M3 {
	public static void main(String[] args) {
		String s1 = "hello";
//					 01234
		char c1 = s1.charAt(5);
		System.out.println(s1);
		System.out.println(c1);
	}
}
