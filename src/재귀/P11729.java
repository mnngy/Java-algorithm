package 재귀;

import java.util.Scanner;

public class P11729 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 원판의 개수
        move(N, 1, 3, 2);
    }

    /**
     * @param N 원판의 개수
     * @param start 현재 타워 번호
     * @param end 목표 타워 번호
     * @param sub 서브 타워 번호
     */
    private static void move(int N, int start, int end, int sub) {
        if (N == 1) {
            System.out.println(start + "->" + end);
            return;
        }
        move(N - 1, start, sub, end);
        move(1, start, end, sub);
        move(N - 1, sub, end, start);
    }
}
