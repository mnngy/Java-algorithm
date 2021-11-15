package 재귀;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10870
public class P10870 {

    /*
    피보나치 수열: F0 = 0, F1 = 1, Fn+2 = fn+1 + fn -> fn = fn-1 + fn-2

    ex) n = 10
    f0 = 0
    f1 = 1
    f2 = f1 + f0 = 1
    f3 = f2 + f1 = 2
    f4 = f3 + f2 = 3
    .
    .
    .
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
