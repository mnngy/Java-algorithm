package 배열;

import java.util.Scanner;

// https://www.acmicpc.net/problem/4344
public class P4344 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int N = scanner.nextInt(); // 학생의 수
            int[] score = new int[N]; // 점수 배열
            double sum = 0; // 성적 총합

            for (int j = 0; j < N; j++) {
                score[j] = scanner.nextInt();
                sum += score[j];
            }

            double avg = sum / N;
            double count = 0;

            for (int j = 0; j < N; j++) {
                if (score[j] > avg) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n", (count/N)*100);
        }
    }
}
