package com.mg1986;

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
