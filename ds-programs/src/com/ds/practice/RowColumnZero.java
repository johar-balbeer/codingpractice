package com.ds.practice;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.HashSet;
import java.util.Set;

public class RowColumnZero {

    void setRowColumnZeroes(int[][] matrix){

        Set<Integer> row = new HashSet<Integer> ();
        Set<Integer> column = new HashSet<Integer>();

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {

                if(matrix[i][j] == 0) {
                    row.add(i);
                    column.add(j);
                }
            }
        }

        for(Integer oneRow : row){
            for(int j = 0; j < 3; j++) {
                matrix[oneRow][j] = 0;
            }
        }

        for(int i = 0; i < 3; i++) {
            for(Integer oneColumn : column){
                matrix[i][oneColumn] = 0;
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        RowColumnZero object = new RowColumnZero();
        int inoutArray[][] = { {0, 1, 2}, {3, 4, 5}, {1, 2, 3} };
        object.setRowColumnZeroes(inoutArray);
    }

}
