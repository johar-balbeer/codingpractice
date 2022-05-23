package com.ds.practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class NextGreater {
    static void getNextGreaterElement(int[] A) {
        Deque<Integer> stack=new ArrayDeque<Integer>();

        for(int i=A.length-1;i>=0;i--) {

            while (!stack.isEmpty() && stack.peek() < A[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                System.out.println(-1);
            } else if (A[i] < stack.peek()) {
                System.out.println(stack.peek());
            }
            stack.push(A[i]);
        }
        }

    public static void main(String[] args) {

        int[] intArr=new int[5];
        intArr[0]=2;
        intArr[1]=3;
        intArr[2]=1;
        intArr[3]=5;
        intArr[4]=6;

        getNextGreaterElement(intArr);
    }
}
