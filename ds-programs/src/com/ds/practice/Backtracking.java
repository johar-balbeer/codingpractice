package com.ds.practice;

import java.util.ArrayList;

public class Backtracking {

    static void printPowerSet(int []set, int set_size) {

        ArrayList<String> subset = new ArrayList<String>();

		long pow_set_size = (long)Math.pow(2, set_size);
        int counter, j;

		for(counter = 0; counter < pow_set_size; counter++) {
            String temp = "";
            for(j = 0; j < set_size; j++) {
				if((counter & (1 << j)) > 0)
                    temp += (Integer.toString(set[j])+'$');
            }

            if(!subset.contains(temp) && temp.length()>0) {
                subset.add(temp);
            }
        }

        for(String s:subset) {
            s = s.replace('$',' ');
            System.out.println(s);
        }
    }

    public static void main (String[] args) {
        int []set = {10, 12, 12};
        printPowerSet(set, 3);
    }

}