package com.ds.practice;

import java.util.*;

public class BalancedParentheses {

    static boolean areBracketsBalanced(String expr)
    {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;

            if (x == ')') {
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
            }

            if (x == '}') {
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
            }

            if (x == ']') {
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args)
    {
        String expr = "([{}])";

        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
