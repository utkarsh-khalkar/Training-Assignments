package com.datatypes.wrapper;

public class JavaConversion {
    public static void main(String[] args) {
        // String to int
        String s1="123";

        int i=Integer.parseInt(s1);
        System.out.println(i);

       // int to String
        int x=10;
        String s2=Integer.toString(x);
        System.out.println(s2);
        System.out.println(s2.getClass().getName());

        // String to long
        long l=Long.parseLong(s2);
        System.out.println(l);

        // String to Float
        float f=Float.parseFloat(s2);
        System.out.println(f);

        // float to string
        String s3=String.valueOf(f);
        System.out.println(s3);
        System.out.println(s3.getClass().getName());

        double d=12345678987877.123;
        System.out.println(d);

    }
}
