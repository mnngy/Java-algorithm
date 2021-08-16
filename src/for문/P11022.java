package for문;

import java.util.Scanner;

// acmicpc.net/problem/11022
public class P11022 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] result = new int[T];
        int[] A = new int[T];
        int[] B = new int[T];

        for (int i = 0; i < T; i++) {
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();
            result[i] = A[i] + B[i];
        }
        scanner.close();

        for (int i = 0; i < T; i++) {
            System.out.printf("Case #%d: %d + %d = %d\n", i+1, A[i], B[i], result[i]);
        }
    }
}
