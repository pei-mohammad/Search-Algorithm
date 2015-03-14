package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6}, {3, 4, 5, 6, 7}, {4, 5, 6, 7, 8}, {5, 6, 7, 8, 9}};
        search(2, array);
    }

    public static void search(int x, int[][] array){
        String[] results = new String[100];
        int numberOfCompares = 0;
        int i = array[0].length - 1;
        int j = 0;
        int resultPointer = 0;

        if (x == array[i][j]){
            numberOfCompares++;
            results[resultPointer] = "[" + Integer.toString(i) + " , " + Integer.toString(j) + "]";
            resultPointer++;
            i--;
            while (j < array[0].length && i >= 0){
                while (x >= array[i][j]){
                    numberOfCompares++;
                    if (x == array[i][j]){
                        results[resultPointer] = "[" + Integer.toString(i) + " , " + Integer.toString(j) + "]";
                        resultPointer++;
                    }
                    j++;
                    if (j > array[0].length - 1) break;
                }
                if (i < 0 || j > array[0].length -1) break;
                while (x <= array[i][j]){
                    numberOfCompares++;
                    if (x == array[i][j]){
                        results[resultPointer] = "[" + Integer.toString(i) + " , " + Integer.toString(j) + "]";
                        resultPointer++;
                    }
                    i--;
                    if (i < 0) break;
                }
            }
        } else {
            while (j < array[0].length && i >= 0){
                while (x >= array[i][j]){
                    numberOfCompares++;
                    if (x == array[i][j]){
                        results[resultPointer] = "[" + Integer.toString(i) + " , " + Integer.toString(j) + "]";
                        resultPointer++;
                    }
                    j++;
                    if (j > array[0].length - 1) break;
                }
                if (i < 0 || j > array[0].length -1) break;
                while (x <= array[i][j]){
                    numberOfCompares++;
                    if (x == array[i][j]){
                        results[resultPointer] = "[" + Integer.toString(i) + " , " + Integer.toString(j) + "]";
                        resultPointer++;
                    }
                    i--;
                    if (i < 0) break;
                }
            }
        }
        System.out.println("Searched Number = " + x);
        System.out.println("Number of Compares = " + Integer.toString(numberOfCompares));
        System.out.println("Locations:");
        for (i = 0; i < resultPointer; i++){
            System.out.println(results[i]);
        }
    }
}