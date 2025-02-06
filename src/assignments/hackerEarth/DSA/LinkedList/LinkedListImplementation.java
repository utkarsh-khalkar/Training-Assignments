package assignments.hackerEarth.DSA.LinkedList;

/**
 * Author: Utkarsh Khalkar
 * Title: LinkedList Implementation
 * Time: 01:55 PM
 * Date: 06-02-2025
 */
public class LinkedListImplementation {

    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }

    }

    public static class LinkedList {
        Node head=null;
        Node tail=null;

        // method to add the data to the end of LinkedList
        void insertAtEnd(int data) {
            Node temp = new Node(data);
            // check if head is null  then assign data to head
            if (head == null) {
                head = temp;
            } else {
                // if no then assign to tail
                tail.next = temp;
            }
            tail = temp;
        }

        // method to display linkedList
        void display() {
            Node temp = head;
            while (temp!= null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        // displying size of the linkedlist
        public int size()
        {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
            }
            return count;
        }

        // insert element at beginning of list
        void insertAtHead(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head =tail= temp;
            } else {
                temp.next = head;
                head = temp;
            }

        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.display();
        System.out.println();
        list.insertAtHead(4);
        list.display();
    }
}
