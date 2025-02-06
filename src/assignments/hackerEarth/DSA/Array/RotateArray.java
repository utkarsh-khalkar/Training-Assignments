package assignments.hackerEarth.DSA.Array;



import java.util.Scanner;

/**
 * Author: Utkarsh Khalkar
 * Title: Write a Java Program to Rotate Elements of Array
 * Time:  11:25 PM
 * Date: 06-02-2025
 */
public class RotateArray {

    // Function to rotate array
    public static void rotateArray(int[] arr,int rotateValue,int arrLength) {

        // array to storing rotate version of array
        int[] temp = new int[arrLength];

        // keeping track of current index
        int k=0;

        // storing rotateValue - arrLength element to array
        for(int i=rotateValue;i<arrLength;i++) {
            temp[k] = arr[i];
            k++;
        }

        // storing first rotateElement into temp
        for(int i=0;i<rotateValue;i++) {
            temp[k] = arr[i];
            k++;
        }

        // copying temp array element to arr to get final rotated array
        for(int i=0;i<arrLength;i++) {
            arr[i] = temp[i];
        }

        //printing rotated elements of array
        for(int i=0;i<arrLength;i++) {
            System.out.print(" "+arr[i]);
        }

    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array length");
        int length=scanner.nextInt();
        // checking if arrlength is less than zero
        if (length<0 || length==0) {
            System.out.println("Invalid array length");
            return;
        }

        System.out.println("Enter the:"+length+" array elements." );
        int[] arr=new int[length];
        for(int i=0;i<length;i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter Rotation Value");
        int rotateValue=scanner.nextInt();
        // checking rotate value not more than array length
        if (rotateValue>length || rotateValue==0) {
            System.out.println("Invalid rotate value");
            return;
        }
        rotateArray(arr,rotateValue,length);
    }
}
