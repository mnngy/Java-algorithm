package 프로그래머스_LV1;

import java.util.Arrays;

public class MatrixSum {

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};

        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.solution(arr1, arr2)));
    }


    private static class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int row = arr1.length;
            int column = arr1[0].length;

            int[][] answer = new int[row][column];
            for (int i = 0; i < row; i++) { // 2
                for (int j = 0; j < column; j++) { // 2
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            return answer;
        }
    }
}
