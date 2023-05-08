package com.akash;

public class Q23 {
	public static void main(String[] args) 
    {
            int[] elements = {10, 40, 4, 7, 25, 5, 8, 6};
            int min = elements[0];
            for(int i = 1; i < elements.length; i++)
            {
                    if(elements[i] < min)
                    {
                            /*statment here*/
                    	min = elements[i];
                    }
            }
            System.out.println("min:" + min);
    }
}
/*
while compilimg and running the above code we should get the following output. .
min:4
To get the above output what could be the commented statement*/