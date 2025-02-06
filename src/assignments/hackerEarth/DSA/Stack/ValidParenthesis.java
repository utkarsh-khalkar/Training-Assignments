package assignments.hackerEarth.DSA.Stack;

import java.util.Stack;

/**
 * Author: Utkarsh Khalkar
 * Title: Write a Program for Checking String is valid parenthesis or not.
 * Time: 03:42 PM
 * Date: 06-02-2025
 */
public class ValidParenthesis {

    // method to check a string is valid or not
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for(char c : chars)
        {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (top != '(' && top != '{' && top != '[') {
                    return false;
                }
            }

        }
        return stack.isEmpty();

    }




    public static void main(String[] args) {
        String s1 = "({[]})";
        String s2 = "({[})";
        System.out.println(isBalanced(s1));
    }

}
