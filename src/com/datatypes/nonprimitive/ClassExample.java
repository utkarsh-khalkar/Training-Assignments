package com.datatypes.nonprimitive;

/**
 * Author: Utkarsh Khalkar
 * Date: 04-02-2025
 * Time: 1:00 PM
 * Title: Class and Object Example
 */
public class ClassExample {
    // defining class variable
    int num1 =10;
    int num2 =20;


    // defining methods of class
    public void add()
    {
        int addition= num1 + num2;
        System.out.println("Addition of Numbers is:"+addition);
    }
    public void sub()
    {
        int subtraction= num1 - num2;
        System.out.println("Subtraction of Numbers is:"+subtraction);
    }

    public static void main(String[] args) {
        // creating object class
        ClassExample ce=new ClassExample();
        // calling methods
        ce.add();
        ce.sub();
    }

}
