package com.techex.algorithms.patterns;

public class NaiveSearch {
    // We are looking for a pattern of text in a sentence (String)
    // TSU's football coach is Eddie George. Eddie (True)


    // Take in a pattern
    // Take in a string
    // Check Length of Pattern

    // IPO (Input, Processing, Output)
    // Params, Algorithm, Return Type - Method Signature


    public static void SearchText(String text, String pattern)
    {

        int patternLength = pattern.length();
        int textLength = text.length();

        //Loop through text length
        for (int i = 0; i <= textLength - patternLength;i++) {

            int j;

            //loop to check for pattern
            for (j = 0; j < patternLength ;j++){
                //i = 24 j = 0
               if (text.charAt(i + j) != pattern.charAt(j)) {
                   break;
               }
            }

            if(j == patternLength) {
                System.out.println("Pattern starts at: " + i);
            }

        }
    }
}