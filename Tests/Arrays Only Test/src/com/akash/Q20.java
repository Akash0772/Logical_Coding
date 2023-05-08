package com.akash;

public class Q20 {
	public static void main(String[] args) 
    {
            int[] elements = {10, 40, 15, 40, 25, 5};
            int sum = 0;
            for(int i = 0; i < elements.length / 2; i++)
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
sum:65
avg:21.666666666666668
To get the above output what could be the commented statement*/