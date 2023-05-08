package com.akash;

public class Q21 {
	public static void main(String[] args) 
    {
            int[] elements = {10, 40, 15, 40, 25, 5};
            int sum = 0;
            for(int i = elements.length / 2; i < elements.length; i++)
            {
                    sum += elements[i];
            }
            
            double avg = (double) sum / (elements.length / 2);

              /*statment here*/
            System.out.println("sum:" + sum);
            System.out.println("avg:" + avg);
    }
}
/*
while compilimg and running the above code we should get the following output. .
sum:70
avg:23.333333333333332

To get the above output what could be the commented statement*/