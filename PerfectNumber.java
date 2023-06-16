//check Perfect number or not

package com.javaprogram;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the elements");
        int value = obj.nextInt();
       PerfectNumber obj1 = new PerfectNumber();
        obj1.Perfect(value);

    }
    public void Perfect(int no)
    {
        int i=1,sum=0,n=0;
        while(i <= no/2)
        {
            if(no % i == 0)
            {
                sum = sum + i;
            }
            i++;
        }
        if(sum==no)
        {
            System.out.println(no+" is a perfect number.");
        }
        else
            System.out.println(no+" is not a perfect number.");
    }
}


