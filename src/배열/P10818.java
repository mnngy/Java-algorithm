package 배열;

import java.util.Arrays;
import java.util.Scanner;

// 다시 풀 필요 없음
// https://www.acmicpc.net/problem/10818
public class P10818 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // N개를 입력

        // N개의 정수 입력받기
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
/*
        // 최댓값, 최솟값 변수 선언 및 초기화
        int max = array[0];
        int min = array[0];

        // 최댓값, 최솟값 찾기
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] <= min) {
                min = array[i];
            }
        }

        System.out.printf("%d %d", min, max);
 */

        Arrays.sort(array); // 오름차순 정렬
        System.out.printf("%d %d", array[0], array[N-1]);
    }
}
