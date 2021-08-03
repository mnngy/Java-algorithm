package for문;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10950
public class P10950 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] A = new int[T];
        int[] B = new int[T];

        for (int i = 0; i < T; i++) {
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < T; i++) {
            System.out.println(A[i] + B[i]);
        }
    }
}
