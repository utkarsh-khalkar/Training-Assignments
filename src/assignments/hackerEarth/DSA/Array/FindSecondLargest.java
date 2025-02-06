package assignments.hackerEarth.DSA.Array;

import java.util.Scanner;

/**
 * Author: Utkarsh khalkar
 * Title: Write a Java program to find Second largest element from array
 * Time: 12:00 PM
 * Date: 06-02-2025
 */

// program to find second largest number
public class FindSecondLargest {

    // method to find second largest number from array
    public static int secondLargest(int[] arr,int arraySize) {
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for (int i = 0; i < arraySize; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;  // Update second largest before updating largest
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // returning second largest element
        return secondLargest;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size= sc.nextInt();
        if (size <= 0) {
            System.out.println("Invalid Array Size, Size must be greater than 0");
            return;
        }
        int[] arr = new int[size];
        System.out.println("Enter the:"+size+":elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Second Largest Element From Array is:"+secondLargest(arr,size));
    }
}
