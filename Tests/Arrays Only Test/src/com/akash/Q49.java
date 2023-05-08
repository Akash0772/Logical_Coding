package com.akash;

public class Q49 {
	 public static void main(String[] args) 
     {
             int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};   

             System.out.println("initial content");
             for(int i = 0; i < elements.length; i++)
             {
                     System.out.print(elements[i] + ",");
             }
             System.out.println();

             int[] temp = elements;
             elements = new int[temp.length + 2];
             for(int i = 0; i < temp.length; i++)
             {
                     elements[i] = temp[i];
             }
             for(int i = elements.length - 1; i > 5; i--)
             {
                     elements[i] = elements[i - 2];
             }        
         
              /* Statment here 
                  Statment here */
             elements[4] = 500;
             elements[5] = 600; 
             
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
10,40,4,50,500,600,125,5,800,6,60,9,100,12,
*/
