package 문자열;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10809
public class P10809 {

    public static void main(String[] args) {
        int[] arr = new int[26];

        for (int i = 0; i <arr.length; i++) {
            arr[i] = -1;
        }

        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
