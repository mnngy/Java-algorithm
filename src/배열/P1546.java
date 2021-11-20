package 배열;

import java.util.Arrays;
import java.util.Scanner;

// 한 번더 풀어보기
// https://www.acmicpc.net/problem/1546
public class P1546 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double array[] = new double[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }
        scanner.close();

        double sum = 0;
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            sum += (array[i] / array[array.length - 1]) * 100;
        }
        System.out.println(sum / array.length);
    }
}
