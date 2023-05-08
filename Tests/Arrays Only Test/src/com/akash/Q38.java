package com.akash;

public class Q38 {
	public static void main(String[] args) 
    {
            int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};   
            System.out.println("initial content");
            for(int i = 0; i < elements.length; i++)
            {
                    System.out.print(elements[i] + ",");
            }
            System.out.println();
            
            int t1 = elements[0];
            int t2 = elements[1];
            for(int i = 0; i < elements.length - 2; i++)
            {
                    elements[i] = elements[i + 2];
            }
            /* Statment here
               Statment here   */
            elements[elements.length - 2] = t1;
            elements[elements.length - 1] = t2; 
            
            System.out.println("final content");
            for(int i = 0; i < elements.length; i++)
            {
                    System.out.print(elements[i] + ",");
            }
    }
}

/* if you want to get the following output then what could be the commented statment
initial content
10,40,4,50,125,5,800,6,60,9,100,12,
final content
4,50,125,5,800,6,60,9,100,12,10,40,
*/