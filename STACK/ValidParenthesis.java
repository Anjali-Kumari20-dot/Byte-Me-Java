package STACK;

import java.util.Stack;

public class ValidParenthesis {
    public static Boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.empty())
                    return false;

                if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return s.empty();
    }

    public static void main(String[] args) {
        String str1 = "({[]}()";
        String str2 = "{[]}()";
        System.out.println(str1 + " - " + isValid(str1)); // output - false
        System.out.println(str2 + " - " + isValid(str2)); // output - true
    }
}
