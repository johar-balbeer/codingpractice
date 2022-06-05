package com.ds.practice;

import java.util.*;

public class RowColumnZero {
    public static void rowColumnZero(int[][] a){
      List rows=new ArrayList();
      List columns=new ArrayList();
      for(int i=0;i<a.length;i++){
          for (int j=0;j<a[i].length;j++){
              if(a[i][j]==0){
                  rows.add(i);
                  columns.add(j);
              }
          }
      }

        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if(rows.contains(i) || columns.contains(j)){
                    a[i][j]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] a=new int[2][2];
        a[0][0]=1;
        a[0][1]=1;
        a[0][2]=1;

        a[1][0]=1;
        a[1][1]=0;
        a[1][2]=1;

        a[2][0]=1;
        a[2][1]=1;
        a[2][2]=1;


        rowColumnZero(a);
    }
}
