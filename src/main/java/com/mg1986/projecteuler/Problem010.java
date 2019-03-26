package com.mg1986.projecteuler;

/**
 * Summation of primes
 * Problem 10
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */

public class Problem010 {

    private static final int limit = 2_000_000;

    public static void main(String[] args) {
        System.out.println(solveProblem());
    }

    private static long solveProblem() {
        long sumOfPrimes = 0;

        for (long idx = 2; idx < limit; idx++) {
            if (isPrime(idx)) {
                sumOfPrimes += idx;
            }
        }

        return sumOfPrimes;
    }

    //  Returns true is input number is a prime number
    private static boolean isPrime(long numToCheck) {
        for (long idx = 2; idx <= numToCheck; idx++) {
            if (numToCheck % idx == 0 && numToCheck != idx) return false;
        }
        return true;
    }
}
