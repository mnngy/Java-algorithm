package for문;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2742
public class P2742 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
