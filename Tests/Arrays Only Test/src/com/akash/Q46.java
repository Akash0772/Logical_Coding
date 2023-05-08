package com.akash;

public class Q46 {
	public static void main(String[] args) 
    {
            int[] elements = {10, 40, 4, 50, 125, 5, 800, 6, 60, 9, 100, 12};   

            System.out.println("initial content");
            for(int i = 0; i < elements.length; i++)
            {
                    System.out.print(elements[i] + ",");
            }
            System.out.println();

            for(int i = 3; i < elements.length - 1; i++)
            {
                    elements[i] = elements[i + 1];
            }
            for(int i = 7; i < elements.length - 2; i++)
            {
                    elements[i] = elements[i + 1];
            }
            for(int i = 10; i < elements.length - 3; i++)
            {
                    elements[i] = elements[i + 1];
            }  
          
           /* Statment here 
              Statment here  */
            int[] temp = elements;
            elements = new int[temp.length - 3]; 
            
            for(int i = 0; i < elements.length; i++)
            {
                    elements[i] = temp[i];
            }
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
10,40,4,125,5,800,6,9,100,
*/