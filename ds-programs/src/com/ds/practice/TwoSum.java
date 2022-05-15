package com.ds.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {


    static void searchIndex(Object[] inputArr,int sum){
        HashMap<Integer,Integer> inputIntegerMap=new HashMap<>();
        inputIntegerMap.put((Integer) inputArr[0],0);
        for(int i=1;i<inputArr.length;i++){
            int requiredInteger=sum-(Integer) inputArr[i];
            if(inputIntegerMap.containsKey(requiredInteger)) {
                System.out.println("Index found "+i+" ,"+inputIntegerMap.get(requiredInteger));
            }
            else{
                inputIntegerMap.put((Integer)inputArr[i],i);
            }
        }
    }

    public static void main(String[] args) {
        Object[] arr=Arrays.asList(12,2,3,4,6,7).toArray();
        int sum=10;
        searchIndex(arr,sum);
    }
}
