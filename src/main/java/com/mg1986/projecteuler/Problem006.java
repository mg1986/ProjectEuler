package com.mg1986.projecteuler;

/**
 * Sum square difference
 * Problem 6
 *
 * The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

public class Problem006 {

    public static void main(String[] args) {
        System.out.println(solveProblem());
    }

    private static long solveProblem() {

        long sumOfSquares = 0;
        long sumOfNumbers = 0;

        for (int idx = 1; idx <= 100; idx++) {
            sumOfSquares += Math.pow(idx, 2);
            sumOfNumbers += idx;
        }

        long squareOfSums = (long) Math.pow(sumOfNumbers, 2);

        return squareOfSums - sumOfSquares;
    }
}
