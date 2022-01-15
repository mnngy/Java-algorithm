import java.util.Scanner;

public class CoverPhoneNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        Solution solution = new Solution();
        System.out.println(solution.solution(s));
    }

    private static class Solution {
        public String solution(String s) {
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length - 4; i++) {
                chars[i] = '*';
            }
            return String.valueOf(chars);
        }
    }
}
