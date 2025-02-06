package com.datatypes.primitive;

public class Datatypeaddtion   {
    public static void main(String[] args) {
        Double object =new Double("2.4");
        int a=object.intValue();
        byte b=object.byteValue();
        float f=object.floatValue();
        double d=object.doubleValue();
        System.out.println(a+b+f+d);
    }
}
