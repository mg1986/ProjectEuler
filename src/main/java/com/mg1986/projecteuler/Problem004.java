package com.mg1986.projecteuler;

/**
 Largest palindrome product
 Problem 4
 A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

 Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Problem004 {

    public static void main(String[] args) {
        System.out.println(solveProblem004());
    }

    private static int solveProblem004() {

        int biggestPalindrome = 0;

        for (int idx1 = 999; idx1 > 0; idx1--) {
            for (int idx2 = 999; idx2 > 0; idx2--) {
                int intToCheck = idx1 * idx2;
                if (isPalindrome(intToCheck)) {
                   return intToCheck;
                }
            }
        }

        return biggestPalindrome;
    }

    private static boolean isPalindrome(int intToCheck) {

        boolean isPalindrome = false;

        StringBuilder sb = new StringBuilder(Integer.toString(intToCheck));
        if (sb.toString().equals(sb.reverse().toString())) {
            isPalindrome = true;
        }

        return isPalindrome;
    }
}
