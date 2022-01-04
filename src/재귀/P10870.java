package 재귀;

import java.util.Scanner;

public class P10870 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(fibonacci(scanner.nextInt()));
        scanner.close();
    }

    // 피보나치 수열의 N번 째 값
    private static int fibonacci(int n) {
        // 1, 1, 2, 3, 5, 8...
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
