package com.datatypes.wrapper;
/*
Java Program to convert primitive to object
Autoboxing example of int to integer
 */
public class AutoBoxingExample {
    public static void main(String[] args) {

        // Convert int into Integer
        int a=20;
        Integer b=Integer.valueOf(a);
        System.out.println(b);
        Integer c=a; //autoboxing, now compiler will write Integer.valueOf(a) internally

        System.out.println(c);


    }
}
