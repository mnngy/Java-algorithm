package 함수;

import java.util.Scanner;

// 한 번 풀었고 다시 풀어야 함
// https://www.acmicpc.net/problem/1065
public class P1065 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
        scanner.close();

        System.out.println(arithmetic_sequence(N));
    }

    private static int arithmetic_sequence(int num) {
        int count = 0; // 한수 카운팅

        if (num < 100) {
            return num;
        }
        else {
            count = 99; // 100 이상의 수가 들어오면 한수의 최소 개수는 99개

            if (num == 1000) {
                num = 999; // 예외처리
            }

            for (int i = 100; i <= num; i++) {
                int hundred = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hundred - ten) == (ten - one)) {
                    count++;
                }
            }
        }

        return count;
    }
}
