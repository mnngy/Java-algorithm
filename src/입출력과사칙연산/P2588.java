package 입출력과사칙연산;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2588
 */
public class P2588 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(A * (B % 10));
        System.out.println(A * ((B / 10) % 10));
        System.out.println(A * (B / 100));
        System.out.println(A * B);
    }
}
