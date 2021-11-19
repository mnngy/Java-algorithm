package 배열;

import java.util.Scanner;

// 다시 풀 필요 없음
// https://www.acmicpc.net/problem/2562
public class P2562 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[9];

        for (int i = 0; i < 9; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int sequence = 0;
        int max = array[0];

        for (int i = 0; i < 9; i++) {
            if (array[i] >= max) {
                max = array[i];
                sequence = i+1;
            }
        }

        System.out.printf("%d\n%d", max, sequence);
    }
}
