package com.ds.practice;

public class PalindromicSting {

    public static void main(String[] args) {
        String input = "babad";
        String subInput = "";
        String output = "";
        int length = -1;

        PalindromicSting obj = new PalindromicSting();

        for(int i = 0; i < input.length() - 2; i++) {
            for(int j  = i + 2; j < input.length(); j++) {

                subInput = input.substring(i, j);
                boolean isPalindrom = obj.isPalindrom(subInput);

                if(isPalindrom && subInput.length() > length) {
                    output = subInput;
                }

            }
        }

        System.out.println("output : " + output);


    }

    boolean isPalindrom (String input) {

        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();

        String rever = input1.toString();

        if(rever.equals(input)){
            return true;
        }
        return false;
    }

}
