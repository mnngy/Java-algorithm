package 문자열;

import java.util.Scanner;
import java.util.StringTokenizer;

// StringTokenizer 기억하기
// https://www.acmicpc.net/problem/1152
public class P1152 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        scanner.close();

        /*
            - StringTokenizer 클래스는 우리가 지정한 구분자로 문자열을 쪼개주는 클래스이다.
            - 그 쪼개진 문자열을 토큰(token)이라고 부른다.
         */

        StringTokenizer stringTokenizer = new StringTokenizer(string, " ");

        System.out.println(stringTokenizer.countTokens());
    }
}
