package com.akash;

public class Q24 {
	public static void main(String[] args) 
    {
            int[] elements = {10, 40, 4, 50, 125, 5, 800, 6};   
            int max = elements[0];
            for(int i = 1; i < elements.length; i++)
            {
                    if(elements[i] > max)
                    {
                            max = elements[i];
                    }
            }
            /*statment here*/
            System.out.println("max:" + max);
    }
}
/*
while compilimg and running the above code we should get the following output. .
max:800
To get the above output what could be the commented statement*/