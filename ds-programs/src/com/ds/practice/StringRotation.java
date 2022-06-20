package com.ds.practice;

public class StringRotation {

    static void detectRotation(String input1,String input2){

        if(input1.length()!=input2.length()){
            System.out.println("Rotation not present");
        }
        else {
            String input = input1.concat(input1);
            if (input.indexOf(input2) != -1) {
                System.out.println("Rotation present");
            } else {
                System.out.println("Rotation not present");
            }
        }

    }

    public static void main(String[] args) {
        String input1="HEMANT";
        String input2="MANTHE";
        detectRotation(input1,input2);
    }
}
