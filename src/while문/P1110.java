package while문;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1110
public class P1110 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int cnt = 0;
        int copy = N;

        while (true) {
            N = ((N%10)*10) + (((N/10)+(N%10))%10);
            cnt++;

            if (N == copy)
                break;
        }
        System.out.println(cnt);
    }
}