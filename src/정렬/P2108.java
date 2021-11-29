package 정렬;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/*
    통계학
    1. 산술평균
    2. 중앙값
    3. 최빈값
    4. 범위
 */
public class P2108 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수의 개수
        double[] numbers = new double[N]; // 수의 집합
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextDouble();
        }
        sc.close();

        // 산술평균
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        System.out.println((int) Math.round(sum/N)); // Math.round(): 입력값에 가장 가까운 값 반환

        // 중앙값
        Arrays.sort(numbers);
        System.out.println((int) numbers[N/2]);

        // 최빈값
        int[] freq = new int[8001]; // -4000 ~ 4000
        // 빈도 입력 받기
        for (double number : numbers) {
            freq[(int) number + 4000]++;
        }

        int maxFrequency = 0; // 최대 빈도
        int maxIndex = 0; // 최대 빈도를 가지는 인덱스
        // 최대 빈도 구하기
        for (int i = 0 ; i < 8001; i ++) {
            if (freq[i] > maxFrequency) {
                maxFrequency = freq[i];
            }
        }
        boolean twice = false; // 최빈값이 여러개 있을 때, 최빈값 중 두 번째로 작은 값을 출력한다

        for (int i = 0; i < 8001; i++) {
            if (freq[i] == maxFrequency) {
                if (twice) {
                    maxIndex = i - 4000;
                    break;
                }
                maxIndex = i - 4000;
                twice = true;
            }
        }
        System.out.println(N == 1 ? (int) numbers[0] : maxIndex);


        // 범위
        System.out.println((int) (numbers[N-1] - numbers[0]));
    }
}
