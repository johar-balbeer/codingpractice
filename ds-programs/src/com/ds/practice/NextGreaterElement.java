package com.ds.practice;

public class NextGreaterElement {

    public static void main(String[] args) {

        int[] input = new int[]{1,5,2,3,5};

        int arrayLength = input.length;

        int output[] = new int[arrayLength];


        for(int i = 0; i < arrayLength - 1; i++) {

            int nextBig = -1;

            for(int j = i+1; j < arrayLength; j++) {
                if(input[j] > input[i]) {
                    nextBig = input[j];
                    break;
                }
            }

            output[i] = nextBig;

        }

        output[arrayLength-1] = -1;

        for(int i = 0; i < arrayLength; i++) {
            System.out.println(output[i]);
        }


    }



}
