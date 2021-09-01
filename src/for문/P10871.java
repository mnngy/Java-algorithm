package for문;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10871
public class P10871 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] sequence = new int[N];

        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
        }

        for (int s : sequence) {
            if (s < X) {
                System.out.print(s + " ");
            }
        }
    }
}
