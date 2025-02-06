package com.learning.Inheritance.Single;

/**
 * Author: Utkarsh Khalkar
 * Title: Single Inheritance
 * Time: 10:30 AM
 * Date: 05-03-2025
 */

// Defining Base class
class Animal
{
    // base class method
    public void eat()
    {
        System.out.println("Animal Eating...");
    }
}
// Child class extend animal
class Dog extends Animal
{
    public void bark()
    {
        System.out.println("Dog Barking...");
    }
}
public class TestSingleInheritance {
    public static void main(String[] args) {

        // creating base class object
        Dog d = new Dog();

        // calling method
        d.eat();
        d.bark();

    }
}
