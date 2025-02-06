package assignments.assignmentGivenByMentor.InterfaceAssignment;

import assignments.assignmentGivenByMentor.Interface.Calculator;

/**
 * Author: Utkarsh Khalkar
 * Title: Interface Example
 * Time: 8:00 PM
 * Date: 04:02:2025
 */
public class CalculatorImplementation implements Calculator {
    // implementation of addition method
    @Override
    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    // implementation of subtraction method
    @Override
    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    // implementation of multiplication method
    public int multiplication(int num1, int num2,int num3) {
        return num1 * num2 * num3;
    }

    public static void main(String[] args) {
        // creating object of class
        Calculator calculator = new CalculatorImplementation();

        // calling method
        System.out.println(calculator.addition(2, 3));

        // calling multiplication method
        System.out.println(calculator.multiplication(2, 3));

        // calling static method of calculator interface
        Calculator.display();
    }
}
