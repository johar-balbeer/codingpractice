package com.ds.practice;

public class StringRotation {

    public static void main (String[] args) {

        String firstString = "mowgli";
        String secondString = "glimow";

        if(firstString.length() != secondString.length()) {
            System.out.println("Not String Rotation");
        } else {
            String temp = firstString + firstString;

            if(temp.indexOf(secondString) != -1) {
                System.out.println("String Rotation");
            } else {
                System.out.println("Not String Rotation");
            }
        }
    }
}
