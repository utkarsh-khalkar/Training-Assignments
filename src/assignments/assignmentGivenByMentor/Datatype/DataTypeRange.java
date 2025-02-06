package assignments.assignmentGivenByMentor.Datatype;

import java.math.BigDecimal;

/**
 * Author: Utkarsh Khalkar
 * Title: Data type range conversion.
 * Date: 05-02-2025
 * Time: 10:00 AM
 */
public class DataTypeRange {
    public static void main(String[] args) {
        int num1=137;
        double num2=327452734247237.434;
        BigDecimal num3=new BigDecimal(num2);
        System.out.println(num3);
        double x=Double.parseDouble(String.valueOf(num2));
        System.out.println(x);
    }
}
