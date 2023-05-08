package com.akash;

public class Q26 {
	 public static void main(String[] args) 
     {
             int[] elements = {10, 40, 4, 50, 125, 5, 800, 6};   
             System.out.println("initial content");
             for(int i = 0; i < elements.length; i++)
             {
                     System.out.print(elements[i] + ",");
             }
             System.out.println();

             /* Statements here */
             elements[2] = 9;
             elements[5] = 3; 

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
10,40,9,50,125,3,800,6,

*/