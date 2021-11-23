package 문자열;

import java.util.Scanner;

// 다시 풀어보기
// https://www.acmicpc.net/problem/2941
public class P2941 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력
        String s = scanner.nextLine();
        scanner.close();

        // 크로아티아 알파벳 개수
        int count = 0;

        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (i < array.length-1) {
                if (array[i] == 'c') {
                    if (array[i+1] == '=') i++;
                    if (array[i+1] == '-') i++;
                }

                if (array[i] == 'd') {
                    if (array[i+1] == 'z' || array[i+2] == '=') i++;
                    if (array[i+1] == '-') i++;
                }

                if (array[i] == 'l' && array[i+1] == 'j') i++;
                if (array[i] == 'n' && array[i+1] == 'j') i++;
                if (array[i] == 's' && array[i+1] == '=') i++;
                if (array[i] == 'z' && array[i+1] == '=') i++;
            }

            count++;
        }

        System.out.println(count);
    }
}
