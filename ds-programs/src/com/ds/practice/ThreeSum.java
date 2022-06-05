package com.ds.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {

    public static void findNumber(List<Integer> inputLst, int sum){
        Object[] inputArr=inputLst.toArray();
        for(int i =0;i<inputArr.length-2;i++){
            int x=(int)inputArr[i];
            int remainingSum=sum-x;
            Map map=new HashMap<Integer,Integer>();
            for(int j=i+1;j<inputArr.length;j++){
              int requiredNum=remainingSum-(int)inputArr[j];
              if(!map.containsKey(inputArr[j])){
                  map.put(requiredNum,inputArr[j]);
              }
              else{
                  System.out.println(x+ " "+inputArr[j]+" "+map.get(inputArr[j]));
              }

            }
        }
    }

    public static void main(String[] args) {
        List inputLst= Arrays.asList(12,2,3,4,6,7,1,5,7,3,6,0);
        int sum=12;
        findNumber(inputLst,sum);
    }
}
