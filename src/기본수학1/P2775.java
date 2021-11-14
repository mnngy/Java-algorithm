package 기본수학1;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2775
public class P2775 {

    public static void main(String[] args) {

        // 아파트 거주 조건:
        // “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다”

        // k층 n호에 몇 명이 살고 있는지 출력

        // 아파트는 0층부터 있고, 각 층은 1호부터 시작한다

        Scanner scanner = new Scanner(System.in);

        // 아파트 생성
        int[][] APT = new int[15][15];

        for(int i = 0; i < 15; i++) {
            APT[i][1] = 1;	// i층 1호
            APT[0][i] = i;	// 0층 i호
        }

        for(int i = 1; i < 15; i ++) {	// 1층부터 14층까지
            for(int j = 2; j < 15; j++) {	// 2호부터 14호까지
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
            }
        }

        // 테스트 부분
        int T = scanner.nextInt();

        for(int i = 0; i < T; i++) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(APT[k][n]);
        }
    }
}

