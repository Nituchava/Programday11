package com.javaprogram;

import java.util.Scanner;

    public class ReverseNum
    {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the elements");
        int value = obj.nextInt();
        ReverseNum obj1 = new ReverseNum();
        obj1.Reverse(value);
    }

    public void Reverse(int no)
    {
        int num=0,rev=0,reminder=0;
        while(no!=0)
        {
            reminder=no%10;
            rev=rev*10+reminder;
            no=no/10;

        }
        System.out.println("reverse no is"+rev);
    }

    }

