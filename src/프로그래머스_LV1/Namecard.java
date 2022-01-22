package 프로그래머스_LV1;

import java.util.Arrays;

public class Namecard {

    public static void main(String[] args) {
        int[][] sizes = {{60, 50},
                         {30, 70},
                         {60, 30},
                         {80, 40}};
        Solution solution = new Solution();
        System.out.println(solution.solution(sizes));
    }

    private static class Solution {
        public int solution(int[][] sizes) {
            /*
            // 가로가 세로보다 짧다면 뒤집는다.
            int temp = 0;
            for (int i = 0; i < sizes.length; i++) {
                if (sizes[i][0] < sizes[i][1]) {
                    temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                }
            }

            int maxWidth = sizes[0][0];
            int maxLength = sizes[0][1];
            for (int i = 1; i < sizes.length; i++) {
                if (sizes[i][0] > maxWidth) {
                    maxWidth = sizes[i][0];
                }
                if (sizes[i][1] > maxLength) {
                    maxLength = sizes[i][1];
                }
            }
            return maxWidth * maxLength;
            */

            int width = 0;
            int length = 0;

            for (int[] size : sizes) {
                width = Math.max(width, Math.max(size[0], size[1]));
                length = Math.max(length, Math.min(size[0], size[1]));
            }
            return width * length;
        }
    }
}
