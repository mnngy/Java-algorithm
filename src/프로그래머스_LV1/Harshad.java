package 프로그래머스_LV1;

public class Harshad {

    public static void main(String[] args) {
        int x = 141;
        System.out.println(new Solution().solution(x));
    }

    private static class Solution {
        public boolean solution(int x) {
            int sum = 0;
            int n = x;

            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }

            if (x % sum == 0) {
                return true;
            }
            return false;
        }
    }
}
