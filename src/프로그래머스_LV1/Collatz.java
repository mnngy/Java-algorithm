package 프로그래머스_LV1;

public class Collatz {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(626331));
    }

    private static class Solution {
        public int solution(long num) {
            int count = 0;

            while (count < 500) {
                if (num == 1) {
                    return count;
                }
                num = num % 2 == 0 ? num / 2 : num * 3 + 1;
                count++;
            }
            return -1;
        }
    }
}
