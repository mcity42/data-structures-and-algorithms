package com.techex.algorithms.sort;

import java.util.Arrays;

// Repeatedly swap adjacent elements
public class Bubble {

    // {5,4,2,1,9,6}
    // O(n^2)
    public static void Sort(int[] arr){

        // Need to know length of the array
        int size = arr.length;

        // Iterate through the array
        for (int i = 0; i < size; i++){
            System.out.println();
            for (int j = 0; j < size - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

       System.out.println(Arrays.toString(arr));
    }

}
