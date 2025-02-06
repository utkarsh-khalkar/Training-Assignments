package com.datatypes.nonprimitive;


public class InterfaceExample implements CalcInterface{
    int sum;
    @Override
    public void multiply(int num1, int num2) {
        sum=num1*num2;
        System.out.println("Multiplication of Numbers is "+sum);
    }

    /**
     *
     * @param a
     * @param b
     */
    @Override
    public void divide(int num1, int num2) {
       int division =num1/num2;
        System.out.println("Division of Numbers is "+division);
    }

    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample();
        obj.multiply(2,3);
        obj.divide(10,5);
    }
}
