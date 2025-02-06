package assignments.hackerEarth.Inheritance;

/**
 * Author: Utkarsh Khalkar
 * Title: Inheritance Implementation
 * Time: 8:00 AM
 * Date: 05-02-2025
 */

// defining base class
public class Arithmetic {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

}
// creating base class

class Adder extends Arithmetic {

}
class Main
{
    public static void main(String[] args) {
        // create a  new adder object
        Adder adder = new Adder();

        // print the name of superclass
        System.out.println("Super class is:"+adder.getClass().getSuperclass().getName());

        // print the result of add method
        System.out.println(adder.add(1, 2));

    }
}
