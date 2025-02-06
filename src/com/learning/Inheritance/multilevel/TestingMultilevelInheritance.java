package com.learning.Inheritance.multilevel;


/**
 * Author: Utkarsh Khalkar
 * Title: Multilevel Inheritance Example
 * Time: 10:39 AM
 * Date: 05-02-2025
 */

// defining parent class
class Animal
{
    public void eat()
    {
        System.out.println("eating...");
    }
}
// creating child class of Animal
class Dog extends Animal
{
    public void bark()
    {
        System.out.println("barking...");
    }
}
// creating child class of Dog
class BabyDog extends Dog
{
    public void weep()
    {
        System.out.println("weeping...");
    }
}
// main class
public class TestingMultilevelInheritance {
    public static void main(String[] args) {
        // creating object of babydog class
        BabyDog babyDog=new BabyDog();

        // calling methods
        babyDog.weep();
        babyDog.bark();
        babyDog.eat();

        System.out.println(babyDog.getClass().getSuperclass().getName());

    }
}
