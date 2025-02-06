package assignments.assignmentGivenByMentor.Datatype;

import java.util.Scanner;

/**
 * Author: Utkarsh Khalkar
 * Date: 04-02-2025
 * Title: Datatype assignment
 * Time: 12:30 PM
 * @
 */
public class DataTypeAssignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of test cases: ");

        // validate number of test cases
        int number ;
        while(true)
        {
            try{
                String input = sc.nextLine().trim();
                if(input.isEmpty()) throw new IllegalArgumentException("Input cannot be empty");
                number = Integer.parseInt(input);
                if(number <= 0) throw new IllegalArgumentException("Number must be positive");
                break;
            }catch (NumberFormatException e){
                System.out.println("Invalid Input");
            }
        }

        for (int i = 0; i < number; i++) {

            System.out.println("Enter number " + (i+1) + ": ");
            String num = sc.nextLine().trim();

            if(num.isEmpty()){
                System.out.println("Invalid Input. Please enter valid input");
                continue;
            }
            try {
                long l = Long.parseLong(num);
                // check if value is non-positive
                if(l<=0)
                {
                    System.out.println("Value must be positive");
                    continue;
                }
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
            }catch (NumberFormatException e){
                System.out.println(num+" can't be fitted anywhere");
            }


        }
    }
}
