package 문자열;

import java.util.Scanner;

// https://www.acmicpc.net/problem/11720
public class P11720 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String str = scanner.next();
        scanner.close();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
