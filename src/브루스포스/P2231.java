package 브루스포스;

import java.io.*;

/*
    분해합, 어떤 자연수가 있을 떄, 그 자연수 N의 분해합은 N과 N을 이루는 각 자라의 합을 의미한다.
    생성자, 어떤 자연수 M의 분해합이 N일 경우, M을 N의 생성자라고 한다.

    N이 주어졌을 때, 가장 작은 생성자를 찾는 프로그램
 */
public class P2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 자연수 N
        int N = Integer.parseInt(br.readLine());
        // 가장 작은 생성자
        int result = 0;

        for (int i = 0; i < N; i++) {
            int number = i;
            int sum = 0; // 각 자릿수 합

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum + i == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
