//Fibonnacci series

package com.javaprogram;

import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the elements");
        int value = obj.nextInt();
        FibbonacciSeries obj1 = new FibbonacciSeries();
        obj1.Fibbonacci(value);

    }
        public void Fibbonacci ( int no)
        {
            int i = 0, first = 0, second = 1, third = 0, num = 10;
            for (i = 1; i <= num; i++) {
                System.out.println(first);
                third = first + second;
                first = second;
                second = third;
            }
        }
    }

