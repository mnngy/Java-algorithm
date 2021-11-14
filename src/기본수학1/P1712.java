package 기본수학1;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1712
public class P1712 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // 고정 비용 -> 변하지 않는 값
        int b = scanner.nextInt(); // 상품 원가
        int c = scanner.nextInt(); // 상품 가격

        // 총 비용과 총 수입이 같아지는 지점: n * 상품 가격 = 고정 비용 + (상품 원가 * n)
        // n = 고정 비용 / 상품 가격 - 상품 원가
        // 이익이 나는 점: 고정 비용 / 상품 가격 - 상품 원가 + 1
        // 이익이 나지 않는 점: 고정 비용 / 상품 가격 - 상품 원가 + 1 < 0

        if (c <= b) {
            System.out.println("-1");
        } else {
            System.out.println(a/(c-b)+1);
        }

    }
}
