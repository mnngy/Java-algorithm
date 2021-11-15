package 재귀;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10872

/*
    컴퓨터에서 재귀는 "자신을 정의할 때 자기 자신을 재 참조하는 방법"을 말한다.

    [고려할 점]
    1. 재귀호출을 너무 반복하지 않게 한다. 재귀가 깊어지면 자바는 StackOverFlow 라는 오류가 나온다.
    재귀를 호출할 때 메모리에 스택이 되기 때문에 메모리를 엄청나게 차지하게 된다. 그리고 수행기간 또한 느려진다.

    2. 재귀 함수가 끝나는 지점을 정확하게 구현해야한다.
    끝나는 지점이 명확하지 않으면 무한 루프에 빠진다.

    *재귀로 풀 수 있는 문제는 대부분 반복문으로 대체하여 풀 수 있다.

    출처: https://st-lab.tistory.com/93
 */
public class P10872 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int sum = factorial(N);
        System.out.println(sum);
    }

    private static int factorial(int N) {
        if (N <= 1) {
            return 1;
        }
        return N * factorial(N - 1);
    }

}
