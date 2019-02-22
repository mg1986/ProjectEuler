package com.mg1986.projecteuler;

/**
 * Multiples of 3 and 5
 * Problem 1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Problem001 {

    public static void main (String[] args) {

        System.out.println(solveProblem001());
    }

    private static int solveProblem001() {
        int answer = 0;
        for (int idx = 1; idx < 1000; idx++) {
            if (idx % 3 == 0 || idx % 5 == 0) {
                answer += idx;
            }
        }

        return answer;
    }
}
