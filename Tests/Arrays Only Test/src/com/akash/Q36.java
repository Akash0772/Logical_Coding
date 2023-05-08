package com.akash;

public class Q36 {
	public static void main(String[] args) 
    {
            int[] elements = {10, 40, 4, 50, 125, 5, 800, 6};   
            System.out.println("initial content");
            for(int i = 0; i < elements.length; i++)
            {
                    System.out.print(elements[i] + ",");
            }
            System.out.println();

           /* Statment here */
            int temp = elements[elements.length - 1];
            for(int i = elements.length - 1; i > 0; i--)
            {
                    /* Statment here */
            	elements[i] = elements[i - 1]; 
            }
            elements[0] = temp;

            System.out.println("final content");
            for(int i = 0; i < elements.length; i++)
            {
                    System.out.print(elements[i] + ",");
            }
    }
}
/* if you want to get the following output then what could be the commented statment
initial content
10,40,4,50,125,5,800,6,
final content
6,10,40,4,50,125,5,800,
*/