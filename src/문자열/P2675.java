package 문자열;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2675
public class P2675 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int R = scanner.nextInt();
            String S = scanner.next();

            scanner.close();

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
