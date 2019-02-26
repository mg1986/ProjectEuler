package com.mg1986.projecteuler;

/**
 * 10001st prime
 * Problem 7
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10,001st prime number?
 */

public class Problem007 {

    public static void main(String[] args) {
        System.out.println(solveProblem007());
    }

    private static long solveProblem007() {

        long primeCounter = 0;
        long prime10001 = 0;

        for (long idx = 2; idx <= Long.MAX_VALUE; idx++) {
            if (isPrime(idx)) primeCounter++;
            if (primeCounter == 10_001) {
                prime10001 = idx;
                break;
            }
        }

        return prime10001;
    }

    private static boolean isPrime(long numToCheck) {

        for (long idx = 2; idx <= numToCheck; idx++) {
            if (numToCheck % idx == 0 && numToCheck != idx) return false;
        }

        return true;
    }
}
