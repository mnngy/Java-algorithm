package 프로그래머스_LV1;

import java.util.Arrays;

public class Interval {

    public static void main(String[] args) {
        long x = -4;
        int n = 2;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(x, n)));
    }

    private static class Solution {
        public long[] solution(long x, int n) {
            long[] result = new long[n];
            for (int i = 0; i < result.length; i++) {
                result[i] = x * (i + 1);
            }
            return result;
        }
    }
}
