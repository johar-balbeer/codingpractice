package com.ds.practice;

import java.util.Arrays;
import java.util.List;

public class StockProblem {

    static void maxStockProfit(List<Integer> stockPrice){

        int maxProfit=0;
        int minSoFar=stockPrice.get(0);
        int intermittentProfit=0;
        for(int i=1;i<stockPrice.size();i++){
            minSoFar=Math.min(minSoFar,stockPrice.get(i));
            intermittentProfit=stockPrice.get(i)-minSoFar;
            maxProfit=Math.max(maxProfit,intermittentProfit);
        }
        System.out.println("Max Profit "+maxProfit);
    }

    public static void main(String[] args) {
        List inputStringLst= Arrays.asList(7,0,1,3,5,7,8,3);
        maxStockProfit(inputStringLst);

    }
}
