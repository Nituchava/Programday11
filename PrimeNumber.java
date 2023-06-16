//Check prime number or ont

package com.javaprogram;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
            Scanner obj = new Scanner(System.in);
            System.out.println("enter the elements");
            int value = obj.nextInt();
          PrimeNumber obj1 = new PrimeNumber();
            obj1.primeNum(value);

    }
           public void primeNum(int no)
             {
                 int cnt = 0;

                 if (no < 2) {
                     System.out.println(no+ " it is not prime Number");
                 }

                 for (int i = 1; i <= no; i++)
                 {
                     if (no % i == 0)
                         cnt += 1;
                 }

                 if (cnt > 2) {
                     System.out.println(no + "not prime number");
                 }
                 else {
                     System.out.println(no + "it is prime number");
                 }
             }
}


