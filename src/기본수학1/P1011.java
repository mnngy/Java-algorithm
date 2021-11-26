package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
    Fly me to the Alpha Centauri

    // 이해 못 했음

   x지점으로부터 y지점까지 정확히 도달하는데 최소한의 장치 작동 횟수를 출력한다.
 */
public class P1011 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 테스크 케이스
        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            String[] temp = reader.readLine().split(" ");

            // 현재 위치
            double x = Double.parseDouble(temp[0]);

            // 목표 위치
            double y = Double.parseDouble(temp[1]);

            // 거리
            double distance = y - x;

            System.out.println(solve(distance));
        }
        reader.close();
    }

    private static int solve(double distance) {
        int result;

        double ref = Math.sqrt(distance); // Math.sqrt(), 루트 값을 구한다

        // 제곱근일 경우
        if (ref % 1 == 0) {
            result = (int) (2 * ref - 1);
        } else {
            double next = Math.ceil(ref); // Math.ceil(), 올림 함수

            if (distance > Math.pow(next, 2) - next) {
                result = (int) (2 * next - 1);
            } else {
                result = (int) (2 * next - 2);
            }
        }
        return result;
    }
}
