package 프로그래머스_LV1;

import java.util.Locale;

public class WeirdText {

    public static void main(String[] args) {
        System.out.println(Solution.solution("try hello world"));
    }

    static class Solution {
        public static String solution(String s) {
            StringBuilder answer = new StringBuilder();

            String[] str = s.split("");
            String space = " ";
            int cnt = 0;

            for (int i = 0; i < str.length; i++) {
                if (str[i].equals(space)) {
                    cnt = 0;
                } else {
                    if (cnt % 2 == 0) {
                        cnt++;
                        str[i] = str[i].toUpperCase();
                    } else {
                        cnt++;
                        str[i] = str[i].toLowerCase();
                    }
                }
                answer.append(str[i]);
            }

            return answer.toString();
        }
    }
}


