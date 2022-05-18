package com.ds.practice;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        List<String> inputStringLst = new ArrayList<String>();
        inputStringLst.add("abc");
        inputStringLst.add("abef");
        inputStringLst.add("abccc");
        inputStringLst.add("abftg");

        String commonPrefix = inputStringLst.get(0);

        for (int i = 1; i < inputStringLst.size(); i++) {

            while (inputStringLst.get(i).indexOf(commonPrefix) != 0) {

                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);

                if (commonPrefix.isEmpty()) {
                    System.out.println("No Common prefix");
                }
            }
        }
        System.out.println(commonPrefix);
    }
}
