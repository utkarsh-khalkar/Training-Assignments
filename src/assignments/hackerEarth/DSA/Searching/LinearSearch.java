package assignments.hackerEarth.DSA.Searching;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * Author: Utkarsh Khalkar
 * Title: Write a Java Program to Search Element in Array
 * Time: 04:46 PM
 * Date: 06-02-2025
 */
public class LinearSearch {

    // method to search element in array
    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Invalid Size");
            return;
        }
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int key = scanner.nextInt();
        if (key < 0) {
            System.out.println("Invalid Key");
            return;
        }
        System.out.println(key+" is found at index: "+linearSearch(arr, key));
    }

}
