package 입출력과사칙연산;

import java.util.Scanner;

public class P1008 {

    /**
     * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        System.out.println(A / B);
    }
}
