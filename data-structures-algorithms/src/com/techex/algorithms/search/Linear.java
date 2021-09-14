package com.techex.algorithms.search;

public class Linear {

public static int search(int[] arr, int searchValue) {

    // initiate variable that holds the count.
    int count = 0;
    //for loop
    for (int i = 0; i < arr.length; i++){
        // check if the current number matches the searchValue
        if (arr[i] == searchValue) {
            count++;
        }
        //increment the loop coun// return count.
    }
    return count;

    }

    public static boolean search( int[] arr, int searchValue, boolean returnValue) {

        //for loop
        for (int i = 0; i < arr.length; i++){
            // check if the current number matches the searchValue
            if (arr[i] == searchValue) {
                return true;
            }
            //increment the loop coun// return count.
        }
        return  false;
    }
}