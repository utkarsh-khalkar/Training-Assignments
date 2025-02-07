package assignments.assignmentGivenByMentor.OOP.LoanApplication;



import java.util.Scanner;

/**
 * Author: Utkarsh Khalkar
 * Title: Bank want a application that gives different type of loan with different Interests. Write a code that will provide you with a payable amount with Interest.
 * Time: 01:22 PM
 * Date: 05-02-2025
 */
public class LoanApplication {

    // method for calculating totalPayable amount
    public static double calculatePayableAmount(double loanAmount,double interestRate, int duration) {
        double interest = loanAmount * (interestRate/100) * duration;
        return interest+loanAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking loan amount
        System.out.println("Enter loan amount");
        double loanAmount = scanner.nextDouble();

        System.out.println("Enter duration");
        int duration = scanner.nextInt();

        // displaying loan type with interest rate
        System.out.println("1. Personal Loan Interest Rate: 10.5% per year");
        System.out.println("2. Education Loan Interest Rate: 12.5% per year");
        System.out.println("3. Housing Loan Interest Rate: 15.5% per year");
        System.out.println("4. Car Loan Interest Rate: 18.5% per year");
        System.out.println("5. Agriculture Loan Interest Rate: 10.5% per year");
        System.out.println("6. Business Loan Interest Rate: 12.5% per year");

        // taking loan type
        System.out.println("Enter Loan Type");
        int loanType = scanner.nextInt();

        double interesRate=0;
        String loanTypeName=" ";
        switch (loanType) {
                case 1:
                    loanTypeName="Personal Loan";
                    interesRate=10.5;
                    break;
                case 2:
                    loanTypeName="Education Loan";
                    interesRate=12.5;
                    break;
                case 3:
                    loanTypeName="Housing Loan";
                    interesRate=15.5;
                    break;
                case 4:
                    loanTypeName="Car Loan";
                    interesRate=18.5;
                    break;
                case 5:
                    loanTypeName="Agriculture Loan";
                    interesRate=10.5;
                    break;
                case 6:
                    loanTypeName="Business Loan";
                    interesRate=12.5;
                    break;
                default:
                    System.out.println("Invalid Loan Type");
                    break;
        }

        // Calculate total payable amount
        double totalAmount=calculatePayableAmount(loanAmount,interesRate,duration);

        // showing result
        System.out.println(" Loan Type: " + loanTypeName);
        System.out.println(" Loan Amount: " + loanAmount);
        System.out.println(" Interest Rate: " + interesRate);
        System.out.println("Loan Duration: " + duration);
        System.out.println("Total Payable Amount: " + totalAmount);


    }

}
