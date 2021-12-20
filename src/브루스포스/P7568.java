package 브루스포스;

import java.io.*;

/*
    완전 탐색 알고리즘: 컴퓨터의 빠른 계산 능력을 이용하는 알고리즘

    구현 과정
    1. 가능한 모든 가짓수를 계산한다.
    2. 어떤 식으로 구현할 지 생각한다. (단순 for문, 순열, 재귀)
 */

public class P7568 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 전체 사람의 수
        int N = Integer.parseInt(br.readLine());

        // 키와 몸무게를 담는 배열
        int[][] arr = new int[N][2];

        // 입력 받기
        String[] sp;
        for (int i = 0; i < N; i++) {
            sp = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(sp[0]);
            arr[i][1] = Integer.parseInt(sp[1]);
        }

        // 비교
        for (int i = 0; i < N; i++) {
            int rank = 1;

            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) rank++;
            }
            bw.write(rank + " ");
            bw.flush();
        }
        bw.close();
    }
}
