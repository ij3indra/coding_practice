package me.jatindra.practice.codejam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vestigium {

    public static void main(String aa[]) {

        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int testCases = scanner.nextInt();
        int inputCount = 1;

        Vestigium vestigium = new Vestigium();

        while (inputCount <= testCases) {

            int arraySize = scanner.nextInt();
            int[][] arr = new int[arraySize][arraySize];

            for (int i = 0; i < arraySize; i++) {
                for (int j = 0; j< arraySize; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }

            Result r = vestigium.calculateTrace(arr);
            System.out.println(String.format("Case #%d: %d %d %d", inputCount, r.diagnalSum, r.dupRowCount, r.dupColCount));
            inputCount++;
        }
    }

    private Result calculateTrace(int[][] arr) {

        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            return new Result(0, 0, 0);
        }

        int diagnalSum = 0;
        int dupRowCount = 0;
        int dupColCount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j< arr.length; j++) {
                if (i == j) {
                    diagnalSum = diagnalSum + (arr[i][j]);
                }
            }
        }

        return new Result(diagnalSum, 0, 0);
    }

    private class Result {
        int diagnalSum = 0;
        int dupRowCount = 0;
        int dupColCount = 0;

        public Result(int ds, int drc, int dcc) {
            this.diagnalSum = ds;
            this.dupRowCount = drc;
            this.dupColCount = dcc;
        }
    }

}
