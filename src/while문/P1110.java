package while문;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1110
public class P1110 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 26
        scanner.close();

        int A; // 10의 자리
        int B; // 1의 자리
        int C; // 새로운 수 1의 자리
        int result = 0; // 새로운 수
        int cycle = 1; // 사이클 수

        while (N != result) {
            A = N / 10; // 2
            B = N % 10; // 6
            C = (A + B) % 10; // 8
            result = (10 * B) + C; // 68
            N = result;
            ++cycle;
        }
        System.out.println(cycle);
    }
}