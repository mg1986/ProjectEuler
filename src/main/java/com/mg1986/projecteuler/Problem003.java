package com.mg1986.projecteuler;

/**
 * Largest prime factor
 * Problem 3
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */

public class Problem003 {

    private static final long limit = 600_851_475_143L;
    private static final int startNum = 2;

    public static void main(String[] args) {
        System.out.println(solveProblem());
    }

    private static long solveProblem() {

        return findLargestPrimeFactorial(limit, 1);
    }

    private static boolean isPrime(long numToCheck) {

        for (long idx = startNum; idx <= numToCheck; idx++) {
            if (numToCheck % idx == 0 && numToCheck != idx) return false;
        }

        return true;
    }

    private static long findLargestPrimeFactorial(long divisor, long largestPrimeFactorial) {

        if (!isPrime(divisor)) {
            for (long idx = startNum; idx <= divisor; idx++) {
                if (divisor % idx == 0 && isPrime(idx)) {
                    divisor = divisor / idx;
                    if (!isPrime(divisor)) {
                        largestPrimeFactorial = findLargestPrimeFactorial(divisor, largestPrimeFactorial);
                    } else {
                        largestPrimeFactorial = idx;
                    }
                }
            }
        }

        return largestPrimeFactorial;
    }
}
