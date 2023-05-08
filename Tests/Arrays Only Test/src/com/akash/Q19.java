package com.akash;

public class Q19 {
	public static void main(String[] args) 
    {
            int[] elements = {10, 40, 15, 40, 25, 5};
            int sum = 0;
            for(int i = 0; i < elements.length; i++)
            {
                    sum += elements[i];
            }
            
            double avg = (double) sum / elements.length;

            /*statment here*/
            /*statment here*/
            System.out.println("sum:" + sum);
            System.out.println("avg:" + avg);
    }
}
/*
while compilimg and running the above code we should get the following output. .
sum:135
avg:22.5
To get the above output what could be the commented statement*/