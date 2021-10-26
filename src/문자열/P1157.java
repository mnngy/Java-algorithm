package 문자열;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1157
public class P1157 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next(); // 알파벳 대소문자로 이루어진 단어

        int[] array = new int[26];

        for (int i = 0; i < S.length(); i++) {
            if ('A' <= S.charAt(i) && S.charAt(i) <= 'Z') {
                array[S.charAt(i) - 'A']++;
            } else {
                array[S.charAt(i) - 'Z']++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (array[i] > max) {
                max = array[i];
                ch = (char) (i + 65);
            } else if (array[i] == max){
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
