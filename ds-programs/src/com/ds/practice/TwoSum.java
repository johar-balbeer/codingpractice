package com.ds.practice;

public class TwoSum {

    public static void main(String[] args) {

        int[] myNum = {1, 3, 3, 4};
        int target = 5;
        
        for (int i = 0; i < myNum.length; i++) {
            for (int j = i+1; j < myNum.length; j++) {
                if (myNum[i] + myNum[j] == target) {
                    System.out.println("index: " + i + ", " + j);
                    break;
                }
            }

        }
    }
}
