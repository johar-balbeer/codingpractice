package com.ds.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {


    static void longestSubtringWithoutRepeat(char[] inputArr){

        Set set=new HashSet();
        int maxLength=0;
        int startIndex=0;
        int endIndex=0;
        for(int i=0;i<inputArr.length;i++){
            if(!set.contains(inputArr[i])){
                set.add(inputArr[i]);
            }
            else{
             if(set.size()>maxLength){
                 endIndex=i-1;
                 maxLength=endIndex-startIndex;
                 set.clear();
                 startIndex=i;
                 set.add(inputArr[i]);
             }
            }
        }
        System.out.println(startIndex+" "+ endIndex);
    }


    public static void main(String[] args) {
        String input="HemantBhagwani";

    }
}


