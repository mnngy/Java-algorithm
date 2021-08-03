package for문;

import java.util.Scanner;

// https://www.acmicpc.net/problem/8393
public class P8393 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;

        for (int i = n; i > 0; i--) {
            result += i;
        }

        System.out.println("result = " + result);
    }
}
