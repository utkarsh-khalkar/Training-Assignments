package assignments.hackerEarth.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author: Utkarsh Khalkar
 * Title: Bag Coin Problem
 * Time: 11:03 AM
 * Date: 05-02-2025
 */

// Main Class
public class BagCoinProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int val=0;
        Bag<Coin> bagOfCoins = new Bag<Coin>();
        Bag<Note> bagOfNotes = new Bag<Note>();
        for(int i=0;i<n;i++)
        {
            String str = sc.next();
            val=sc.nextInt();

            switch (str)
            {
                case "Coin":
                    Coin coin=new Coin();
                    int c=coin.setValue(val);
                    bagOfCoins.add(c);
                    break;
                case "Note":
                    Note note=new Note();
                    int c1=note.setValue(val);
                    bagOfNotes.add(c1);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
                }

            }

        System.out.println("Coins :");
        bagOfCoins.display();
        System.out.println("Notes :");
        bagOfNotes.display();

        }

}

// creating class for Note
class Note
{
    // method for setting note value
    public int setValue(int value)
    {
        return value;
    }
}

// creating class for Coin
class Coin
{
    // method for setting coin value
    public int setValue(int value)
    {
        return value;
    }
}

// creating generic class
class Bag<T>
{

        List<Integer> list=new ArrayList<Integer>();

        // method for adding coin and notes
        public void add(int object)
        {
            list.add(object);
        }

        // method for coin and note display
        public void display()
        {
            for (int i=0;i<list.size();i++)
            {
                System.out.println(list.get(i)+" ");
            }
        }
}
