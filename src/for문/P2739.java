package for문;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2739
public class P2739 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", N, i, N*i);
        }
    }
}
