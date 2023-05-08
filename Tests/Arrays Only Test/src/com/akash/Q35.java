package com.akash;

public class Q35 {
	public static void main(String[] args) 
    {
            int[] elements = {10, 40, 4, 50, 125, 5, 800, 6};   
            System.out.println("initial content");
            for(int i = 0; i < elements.length; i++)
            {
                    System.out.print(elements[i] + ",");
            }
            System.out.println();

            int temp = elements[0];
            for(int i = 0; i < elements.length - 1; i++)
            {
                   /* Statment here */
            	elements[i] = elements[i + 1];	
            }
            /* Statment here */
            elements[elements.length - 1] = temp;
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
40,4,50,125,5,800,6,10
*/
