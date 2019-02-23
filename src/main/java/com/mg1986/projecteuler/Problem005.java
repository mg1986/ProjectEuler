package com.mg1986.projecteuler;

/**
 * Smallest multiple
 * Problem 5
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Problem005 {

    private static int[] oneToTwenty = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    public static void main(String[] args) {
        System.out.println(solveProblem005());
    }

    private static int solveProblem005() {

        int smallestDivisibleOneToTwenty = 0;

        for (int idx = 1; idx < Integer.MAX_VALUE; idx++) {
            if (isDivisibleOneToTwenty(idx)) {
                smallestDivisibleOneToTwenty = idx;
                break;
            }
        }

        return smallestDivisibleOneToTwenty;
    }

    private static boolean isDivisibleOneToTwenty(int intToCheck) {

        boolean isDivisibleOneToTwenty = true;

       for (int num : oneToTwenty) {
           if (intToCheck % num != 0) {
               isDivisibleOneToTwenty = false;
               break;
           }
       }

        return isDivisibleOneToTwenty;
    }
}
