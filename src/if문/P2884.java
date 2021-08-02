package if문;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2884
public class P2884 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();

        /*
        if (H == 0) {
            if (M >= 45) {
                System.out.print(H);
                System.out.print(" ");
                System.out.print(M - 45);
            } else {
                System.out.print(23);
                System.out.print(" ");
                System.out.print((M + 60) - 45);
            }
        } else {
            if (M >= 45) {
                System.out.print(H);
                System.out.print(" ");
                System.out.print(M - 45);
            } else {
                System.out.print(H - 1);
                System.out.print(" ");
                System.out.print((M + 60) - 45);
            }
        }
         */

        if (M < 45) {
            M = M + 15;
            if (H == 0) {
                H = 23;
            } else {
                --H;
            }
        } else {
            M = M - 45;
        }

        System.out.printf("%d %d", H, M);
    }
}
