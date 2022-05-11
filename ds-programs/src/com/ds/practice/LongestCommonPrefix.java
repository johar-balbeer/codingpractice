package com.ds.practice;

import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {

    static String commonPrefix(String input1,String input2) {
        String result = "";
        for (int i = 0, j = 0; i < input1.length() && j < input2.length(); i++, j++) {
            if (input1.charAt(i) != input2.charAt(j)) {
                break;
            }
            result += input1.charAt(i);
        }
        return result;
    }

    static String searchCommonPrefix(List<String> inputLst) {
        String prefix = inputLst.get(0);
        for (int i = 1; i < inputLst.size(); i++) {
            prefix = commonPrefix(prefix, inputLst.get(i));
        }
        return prefix;
    }



    public static void main(String[] args) {
        List inputStringLst=Arrays.asList("Bun","Burger","Bummer");
        String result=searchCommonPrefix(inputStringLst);
        System.out.println("LCP is: "+result);

    }

}
