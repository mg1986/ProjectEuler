package com.mg1986.projecteuler;

import java.util.List;
import java.util.ArrayList;

public class Problem002 {

    static final int limit = 4_000_000;
    static List<Integer> intList;

    public static void main (String[] args) {

        System.out.println(solveProblem002());
    }

    private static int solveProblem002() {

        intList = new ArrayList();
        intList.add(1);
        intList.add(2);

        int nextFib = 0;
        while (nextFib <= limit) {
            int listSize = intList.size();
            nextFib = intList.get(listSize-1) + intList.get(listSize-2);
            intList.add(nextFib);
        }

        int answer = 0;
        for (int fib : intList) {
            if (fib % 2 == 0) {
                answer += fib;
            }
        }

        return answer;
    }
}
