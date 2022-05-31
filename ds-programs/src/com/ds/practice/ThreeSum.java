package com.ds.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    List<List<Integer>> threeSumApi(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> outputList = new ArrayList<>();

        for(int i = 0; i < nums.length - 2; i++) {
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int low = i + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i];

                while (low < high) {
                    if(nums[low] + nums[high] == sum) {
                        outputList.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low < high && nums[low] == nums[low + 1]) low ++;
                        while(low < high && nums[high] == nums[high - 1]) high --;
                        low ++;
                        high --;
                    } else if(nums[low] + nums[high] > sum){
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }
        return outputList;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 1, 0, -1, -2};

        ThreeSum object = new ThreeSum();
        List outList = object.threeSumApi(input);
        System.out.println(outList);

    }

}
