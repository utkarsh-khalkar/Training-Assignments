package assignments.assignmentGivenByMentor.Interface;

/**
 * Author: Utkarsh Khalkar
 * Date: 04-02-2025
 * Time: 8:00 PM
 * Title: Interface for Calculator
 */
public interface Calculator {

    // method for addition of two number
    int addition(int num1, int num2);

    // method for addition of two number
    int subtraction(int num1, int num2);

    default int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    static void display()
    {
        System.out.println("---Calculator--- ");
    }
}
