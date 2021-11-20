package 배열;

import java.util.Scanner;

// 한 번더 풀어보기
public class P8958 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String array[] = new String[scanner.nextInt()];

        // 테스트 케이스 개수만큼 문자열 입력받기
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        scanner.close();

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            int sum = 0;

            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(j) == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                sum += count;
            }
            System.out.println(sum);
        }
    }
}
