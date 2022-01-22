package 프로그래머스_LV1;

public class EvenOrOdd {

    public static void main(String[] args) {
        int num = 4;
        Solution solution = new Solution();
        System.out.println(solution.solution(num));
    }


    private static class Solution {
        public String solution(int num) {
            return num % 2 == 0 ? "Even" : "Odd";
        }
    }
}
