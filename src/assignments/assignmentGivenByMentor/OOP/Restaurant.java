package assignments.assignmentGivenByMentor.OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: Utkarsh Khalkar
 * Title: Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings, and methods to add and remove items, and to calculate average rating.
 * Time: 11:47 AM
 * Date: 05-02-2025
 */


public class Restaurant {
    // Declare the ArrayLists as final so their references cannot be changed
    private final ArrayList<String> menuItem;
    private final ArrayList<Double> prices;
    private final ArrayList<Double> ratings;
    //private ArrayList<String> demo=new ArrayList<>();


    // constructor to initialize list
    public Restaurant() {
        menuItem = new ArrayList<>();
        prices = new ArrayList<>();
        ratings= new ArrayList<>();
    }
    // method to add menu item
    public void addMenuItem(String item,Double price,Double rating) {
        menuItem.add(item);
        prices.add(price);
        ratings.add(rating);
    }
    // removing Items
    public void removeItem(String item) {
        int index = menuItem.indexOf(item);
        if(index !=-1){
            menuItem.remove(index);
            prices.remove(index);
            ratings.remove(index);
        }else{
            System.out.println("Item not found");
        }
    }

    // calculating average ratings
    public float averageRating() {
        if(ratings.isEmpty())
            return 0;
        float sum = 0;
        for(Double rating : ratings)
        {
            sum += rating;
        }
        return sum/ratings.size();
    }

    // displaying menu items
    public void displayMenu() {
        if (menuItem.isEmpty()) {
            System.out.println("You don't have any restaurant items");
        }
        for(int i=0;i<menuItem.size();i++) {
            System.out.println("Menu Item:"+menuItem.get(i)+" Price:"+prices.get(i)+" Rating: "+ratings.get(i));
        }
    }

    // main method to test functionality
    public static void main(String[] args)  {
/*
        // creating object of restaurant class
        Restaurant restaurant = new Restaurant();

        // Adding menu Item
        restaurant.addMenuItem("Pizza", 150.12F,3.5F);
        restaurant.addMenuItem("Burger",120.9F,4.5F);
        restaurant.addMenuItem("Paratha",50F,5F);

        // Displaying Menu Item
        restaurant.displayMenu();
        // calculating and displaying average rating
        System.out.println("Average Rating:"+restaurant.averageRating());
        // removing Item
        restaurant.removeItem("Pizza");
        System.out.println("Menu Items After removing Pizza");

        restaurant.displayMenu();

        // calculating and displaying average rating
        System.out.println("Average Rating:"+restaurant.averageRating());


*/
        Restaurant restaurant = new Restaurant();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println("Enter your choice");
            System.out.println("Enter 1 for Adding Menu Item");
            System.out.println("Enter 2 for Removing Menu Item");
            System.out.println("Enter 3 for Displaying Menu Item");
            System.out.println("Enter 4 for Displaying Average of Ratings");
            System.out.println("Enter 5 for Exit");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter  Menu Item");
                    String item = scanner.next();
                    System.out.println("Enter Price");
                    String price = scanner.next();
                    System.out.println("Enter Rating");
                    String rating = scanner.next();
                    double ratingValue;
                    try {
                        ratingValue = Double.parseDouble(rating);
                        if (ratingValue <= 0 || ratingValue >=6) {
                            System.out.println("Invalid Rating.  enter a rating between 1 and 5.");
                        } else {
                            restaurant.addMenuItem(item, Double.parseDouble(price), ratingValue);
                            System.out.println("Item Added Successfully");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a numeric value for the rating.");
                    }
                    break;
                case 2:
                    System.out.println("Enter Item Which you want to Remove.");
                    String item2 = scanner.next();
                    restaurant.removeItem(item2);
                    System.out.println("Item Removed Successfully");
                    break;
                case 3:
                    restaurant.displayMenu();
                    break;
                case 4:
                    System.out.println("Average Rating:"+restaurant.averageRating());
                    break;
                case 5:
                    flag = false;
                    System.out.println("Exiting Program");
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }while (flag);

    }

}
