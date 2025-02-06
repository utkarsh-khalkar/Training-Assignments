package assignments.hackerEarth.Inheritance;

/**
 * Author: Utkarsh Khalkar
 * Title: Inheritance Implementation
 * Time: 7:20 AM
 * Date: 05-02-2025
 */

// Animal Parent class
public class Animal {

    // class method
    void walk()
    {
        System.out.println("I am walking");
    }
}
// base class which extend animal class
class Bird extends Animal
{
    // base class method
    void fly()
    {
        System.out.println("I am flying");
    }
    void sing()
    {
        System.out.println("I am singing");
    }
}
// main class
class Solution{
    public static void main(String[] args) {
        // creating object of base class
        Bird d = new Bird();
        // calling method of base class
        d.walk();
        d.fly();
        d.sing();
    }
}
