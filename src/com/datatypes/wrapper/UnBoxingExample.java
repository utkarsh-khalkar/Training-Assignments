package com.datatypes.wrapper;
/*
//Java program to convert object into primitives
//Unboxing example of Integer to int
 */
public class UnBoxingExample {
    public static void main(String[] args) {

        // convert integer to int
        Integer i = new Integer(1);
        int x=i.intValue(); // convert integer to int explicitly.

        int j=i;// compiler will write intValue internally.



    }
}
