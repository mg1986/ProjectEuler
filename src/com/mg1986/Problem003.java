package com.mg1986;

public class Problem003 {

    private static final long limit = 600_851_475_143L;

    public static void main(String[] args) {
        System.out.println(solveProblem003());
    }

    private static long solveProblem003() {
        return findLargestPrimeFactorial(limit, 1);
    }

    private static boolean isPrime(long numToCheck) {

        for (long idx = 2; idx <= numToCheck; idx++) {
            if (numToCheck % idx == 0 && numToCheck != idx) return false;
        }

        return true;
    }

    private static long findLargestPrimeFactorial(long divisor, long largestPrimeFactorial) {

        if (!isPrime(divisor)) {
            for (long idx = 2; idx <= divisor; idx++) {
                if (divisor % idx == 0 && isPrime(idx)) {
                    largestPrimeFactorial = (idx > largestPrimeFactorial) ? idx : largestPrimeFactorial;
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
