package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P10989 {

    public static void main(String[] args) throws IOException {
        /*
            BufferedReader 와 Scanner 차이점
            - 활용적 Scanner > BufferedReader
            - 버퍼 크기 BufferedReader > Scanner
            - BufferedReader 는 Scanner 보다 오래되었다.
            - Scanner은 정규식을 사용하여 값을 파싱해 속도가 느리다.

            빅오 표기법(big-O notation)
            - 알고리즘의 효율성은 데이터 개수(n)가 주어졌을 때 덧셈, 뺄셈, 곱셈 같은 기본 연산의 횟수를 의미한다.
            - 빅오: 상한선, 빅오메가: 하한선, 빅세타: 상한선과 하한선 사이
        */

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        int N = Integer.parseInt(br.readLine());
//        int[] array = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            array[i] = Integer.parseInt(br.readLine());
//        }

        /*
            Arrays.sort() 의 경우 dual-pivot Quick sort 알고리즘을 사용한다.
            평균 O(nlogn) 하지만 최악의 경우 O(n^2)이다.
         */

//        Arrays.sort(array);
//
//        for (int i = 0; i < N; i++) {
//            sb.append(array[i]).append("\n");
//        }
//
//        System.out.println(sb);

        // 문제에서 수에 범위가 1 ~ 10000

        int[] count = new int[10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10001; i++) {
            while(count[i] > 0) {
                sb.append(i).append("\n");
                count[i]--;
            }
        }
        System.out.println(sb);
    }
}
