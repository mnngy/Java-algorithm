import java.util.Scanner;

public class NumberStringsAndEnglishWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        Solution solution = new Solution();
        System.out.println("" + solution.solution(s));
    }

    private static class Solution {
        public int solution(String s) {
            String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
            String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            for (int i = 0; i < 10; i++) {
                s = s.replace(word[i], num[i]);
            }
            return Integer.parseInt(s);
        }
    }
}
