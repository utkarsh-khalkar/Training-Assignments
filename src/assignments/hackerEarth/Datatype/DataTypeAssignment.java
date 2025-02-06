package assignments.hackerEarth.Datatype;

import java.util.Scanner;

/**
 * Author: Utkarsh Khalkar
 * Date: 04-02-2025
 * Title: Datatype assignment
 * Time: 12:30 PM
 * @
 */
public class DataTypeAssignment {
    // Create logger instance for logging messages


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");

        // read the number of test cases
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {

            long l=sc.nextLong();

            // print the result
            System.out.println(l+" fitted in");

            // Check the data type constraint in order
            if(l>=Byte.MIN_VALUE && l<=Byte.MAX_VALUE)
                System.out.println(" * byte");
            if (l>=Short.MIN_VALUE && l<=Short.MAX_VALUE)
                System.out.println(" * short");
            if (l>=Integer.MIN_VALUE && l<=Integer.MAX_VALUE)
                System.out.println(" * int");
            if (l>=Long.MIN_VALUE && l<=Long.MAX_VALUE)
                System.out.println(" * long");
        }
    }
}
