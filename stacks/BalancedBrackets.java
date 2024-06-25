package stacks;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Java Questions
 * Package - stacks
 * Created_on - June 25 - 2024
 * Created_at - 14:08
 */

public class BalancedBrackets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        for (int i=0 ; i<str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                if (!Objects.equals(stack.peek(), '(')) {
                    System.out.println(false);
                    return;
                } else if (stack.isEmpty()){
                    System.err.println(false);
                    return;
                } else {
                    stack.pop();
                }
            } else if (ch == '}') {
                if (!Objects.equals(stack.peek(), '{')) {
                    System.out.println(false);
                    return;
                } else if (stack.isEmpty()){
                    System.err.println(false);
                    return;
                } else {
                    stack.pop();
                }
            } else if (ch == ']') {
                if (!Objects.equals(stack.peek(), '[')) {
                    System.out.println(false);
                    return;
                } else if (stack.isEmpty()){
                    System.err.println(false);
                    return;
                } else {
                    stack.pop();
                }
            }
        }
    }
}
