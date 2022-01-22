package 프로그래머스_LV1;

import java.util.Arrays;

public class GymCloth {

    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        Solution solution = new Solution();
        System.out.println(solution.solution(n, lost, reserve));
    }

    private static class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = n - lost.length;

            Arrays.sort(lost);
            Arrays.sort(reserve);

            // 체육복 챙긴 학생이 도난당한 경우
            for (int i = 0; i < lost.length; i++) {
                for (int j = 0; j < reserve.length; j++) {
                    if (lost[i] == reserve[j]) {
                        answer++;
                        lost[i] = -1;
                        reserve[j] = -1;
                        break;
                    }
                }
            }

            // 빌려주는 경우
            for (int i = 0; i < lost.length; i++) {
                for (int j = 0; j < reserve.length; j++) {
                    if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                        answer++;
                        reserve[j] = -1;
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
