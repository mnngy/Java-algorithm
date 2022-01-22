package 프로그래머스_LV1;

import java.util.Arrays;

public class Euclidean {

    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        Solution solution = new Solution();
        int[] result = solution.solution(n, m);
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }

    private static class Solution {
        public int[] solution(int n, int m) {
            // 유클리드 호제법을 통해 최대공약수를 구한다.
            int min = (n > m) ? m : n;
            int gcd = 0;
            for (int i = 1; i <= min; i++) {
                if (n % i == 0 && m % i == 0) {
                        gcd = i;
                }
            }
            return new int[] {gcd, (n * m/gcd)};
        }
    }
}
