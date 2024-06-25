package stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Java Questions
 * Package - stacks
 * Created_on - June 25 - 2024
 * Created_at - 13:58
 * Solution - https://www.youtube.com/watch?v=aMPXhEdpXFA&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=105
 */

public class DuplicateBrackets {

    public static boolean findDuplicate(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i=0 ; i<str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (stack.peek() == '(') {
                    return true;
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findDuplicate(str));
    }
}
