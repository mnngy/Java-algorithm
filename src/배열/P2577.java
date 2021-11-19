package 배열;

import java.util.Scanner;

// 한 번더 풀어도 괜찮을 문제
// 2가지 해결방법이 있다. 1. 문자열 분리 2. 값 비교
// https://www.acmicpc.net/problem/2577
public class P2577 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // A, B, C 입력 받기
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        // 계산한 결과, 각각의 숫자가 몇 번씩 쓰였는지... 변수 선언
        int result = A * B * C; // 17037300
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }

        // 각각의 숫자 몇 번씩 쓰였는지
        while (result != 0) {
            int n = result % 10;
            ++array[n];
            result = result / 10;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
