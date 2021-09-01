package while문;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10951
public class P10951 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(A + B);
        }
    }
}
