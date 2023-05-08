package com.akash;

public class Q28 {
	public static void main(String[] args) 
    {
            int[] elements = {10, 40, 4, 50, 125, 5, 800, 6};   
            System.out.println("initial content");
            for(int i = 0; i < elements.length; i++)
            {
                    System.out.print(elements[i] + ",");
            }
            System.out.println();

            elements[2] = elements[2] + elements[5];
            elements[5] = elements[2] - elements[5];    
           /* Statment here */
            elements[2] = elements[2] - elements[5];

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
10,40,5,50,125,4,800,6,

*/