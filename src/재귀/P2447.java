package 재귀;

import java.util.Scanner;

/*
    별 찍기 - 10

    무조건 한 번 더 풀기
 */
public class P2447 {

    static char[][] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 3, 9, 27...
        scanner.close();

        arr = new char[N][N];

        star(0, 0, N, false);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void star(int x, int y, int N, boolean blank) {

        // 공백칸
        if (blank) {
            for (int i = x; i < x + N; i++) {
                for (int j = y; j < y + N; j++) {
                    arr[i][j] = ' ';
                }
            }
        }

        // 더 이상 쪼갤 수 없는 블록
        if (N == 1) {
            arr[x][y] = '*';
            return;
        }

        int size = N / 3; // 빈칸의 사이즈
        int count = 0; // 별 출력 누적
        for (int i = x; i < x + N; i += size) {
            for (int j = y; j < y + N; j += size) {
                count++;
                if (count == 5) {
                    star(i, j, size, true);
                } else {
                    star(i, j, size, false);
                }
            }
        }
    }
}
