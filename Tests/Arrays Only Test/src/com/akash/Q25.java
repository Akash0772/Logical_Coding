package com.akash;

import java.util.Arrays;

public class Q25 {
	public static void main(String[] args) 
	{
		int[] x = {20, 20};
		int i = 0, j = 0;
		x[i] = x[i] + x[j];
		x[j] = x[i] - x[j];
		x[i] = x[i] - x[j];
		/* Statment Here */
		System.out.println(Arrays.toString(x));
	}
}
/* if you want to get the following output then what could be the commented statment
[0, 20]

*/