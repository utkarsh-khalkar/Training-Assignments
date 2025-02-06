package assignments.hackerEarth.DSA.Stack;

/**
 * Author: Utkarsh Khalkar
 * Title: Stack Implementation using array
 * Time: 03:09 PM
 * Date: 06-02-2025
 */
public class StackImplementation {
    public static class Stack {
        int maxSize;
        int top;
        int[]  arr;

        // constructor for initialization
        public Stack(int maxSize) {
            this.maxSize = maxSize;
            arr = new int[maxSize];
            top = -1;
        }

        // add element to stack
        public void push(int value) {
            if (top == maxSize - 1) {
                System.out.println("Stack is full");
            } else {
                arr[++top] = value;
            }
        }

        // remove and return element from stack
        public int pop() {
            if (top == -1) {
                System.out.println("Stack is empty");
            }
            return arr[top--];
        }

        // return top element of stack
        public int peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
            }
            return arr[top];
        }
        // check size of stack
        public int size() {
            return top ;
        }

        // check stack is empty or not
        public boolean isEmpty()
        {
            if (top<0)
            {
                return true;
            }
            return false;
        }

        // display stack element
        public void displayElement()
        {
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.displayElement();
        System.out.println();
        stack.pop();
        System.out.println("Stack after removing one element from the stack");
        stack.displayElement();
        System.out.println();
        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack Top Element: " + stack.peek());
        System.out.println("Stack is Empty: " + stack.isEmpty());



    }
}
