

public class Problem001 {

    public static void main (String[] args) {
        System.out.println(solveProblem());
    }

    public static int solveProblem() {
        int answer = 0;
        for (int idx = 1; idx < 1000; idx++) {
            if (idx % 3 == 0 || idx % 5 == 0) {
                answer += idx;
            }
        }
        return answer;
    }
}
