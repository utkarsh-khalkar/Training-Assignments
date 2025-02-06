package com.datatypes.primitive;

public class TypeCasting {
    public static void main(String[] args) {
        // Below code show the Implicit typecasting which means converting data from lower datatype to higher datatype.
        //automatically converts the integer type into long type
        int x=4;
        System.out.println( (((Object)x).getClass().getName()));
        long d=x;
        System.out.println(((Object)d).getClass().getName());

        float a=x;
        System.out.println(((Object)a).getClass().getName());

        double D=a;
        System.out.println(((Object)D).getClass().getName());

        //Below code shows Explicit typecasting which coverts higher datatype to lower datatype.
        double d1=166.66;

        long l1=(long) d1;

        int i1=(int)l1;
        System.out.println(((Object) i1).getClass().getName());


    }
}
