package assignments.hackerEarth.DSA.LinkedList;

/**
 * Author: Utkarsh Khalkar
 * Title: Write a Program to Reverse Linked List
 * Time:
 */
public class ReverseList {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public static class LinkedList {
        Node head=null;
        Node tail=null;
        int size=0;

        // insert data at end of list
        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail=temp;
            }
        }

        // reverse the list
        void reverse() {
            Node prev = null;
            Node curr = head;
            Node next= null;
            while (curr != null) {
                next = curr.next; // store next node
                curr.next = prev; // reverse the link
                prev = curr;
                curr = next;
            }
            head = prev;
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.display();
        System.out.println();
        System.out.println("Reverse List");
        list.reverse();
        list.display();
    }
}
