package for문;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2439
public class P2439 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= N; i++) {
            for (int j = N-1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
