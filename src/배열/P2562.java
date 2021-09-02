package 배열;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2562
public class P2562 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array[] = new int[9];
        int max = array[0];
        int count = 0;

        for (int i = 0; i < 9; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }
        scanner.close();

        for (int j = 0; j < 9; j++) {
            if (array[j] == max) {
                count = j + 1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
