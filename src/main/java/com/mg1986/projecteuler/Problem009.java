package com.mg1986.projecteuler;

/**
 * Special Pythagorean triplet
 * Problem 9
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 *
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 */

public class Problem009 {

    public static void main(String[] args) {
        System.out.println(solveProblem());
    }

    private static int solveProblem() {

        int answer = 0;

        int a = 997;
        int b = 998;
        int c = 999;

        // Brute forced
        for (int idxC = c; idxC > 0; idxC--)  {
            for (int idxB = b; idxB > 0; idxB--)  {
                for (int idxA = a; idxA > 0; idxA--)  {
                    if (ifPythagoreanTriplet(idxA, idxB, idxC) && sumInts(idxA, idxB, idxC) == 1000) {
                        answer = idxA * idxB * idxC;
                        break;
                    }
                }
            }
        }

        return answer;
    }

    // Returns true if 3 ints are Pythagorean Triplet
    private static boolean ifPythagoreanTriplet (int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }

    // Returns sum of 3 ints
    private static int sumInts(int a, int b, int c) {
        return a + b + c;
    }
}
