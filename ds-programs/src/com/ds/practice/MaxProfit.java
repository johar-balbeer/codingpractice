package com.ds.practice;

public class MaxProfit {


    public static void main(String[] args) {

        int[] input = new int[]{7,1,5,3,6,4};

        int arrayLength = input.length;

        int profit = 0;
        for (int i = 0; i < arrayLength - 1; i++) {

           for (int j = i+1; j < arrayLength; j++) {

               int currentProfit = input[j] - input[i];

               if (currentProfit > profit){
                   profit = currentProfit;
               }

           }
        }
        System.out.println("Max Profit is: " + profit);
    }

}
