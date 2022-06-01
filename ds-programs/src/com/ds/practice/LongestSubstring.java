package com.ds.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstring {

    public Boolean areDistinct(String str, int i, int j) {
        boolean[] visited = new boolean[26];

        for(int k = i; k <= j; k++) {
            if (visited[str.charAt(k) - 'a'])
                return false;
            visited[str.charAt(k) - 'a'] = true;
        }
        return true;
    }

    public int longestUniqueSubsttr(String str) {
        int n = str.length();

        int res = 0;

        for(int i = 0; i < n; i++)
            for(int j = i; j < n; j++)
                if (areDistinct(str, i, j))
                    res = Math.max(res, j - i+1);

        return res;
    }


    public static void main(String[] args) {
        LongestSubstring object = new LongestSubstring();
        int len = object.longestUniqueSubsttr("workattech");
        System.out.println("len : " + len);
    }



}
