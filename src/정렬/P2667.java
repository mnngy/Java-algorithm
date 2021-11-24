package 정렬;

import java.util.Scanner;

// 수 정렬하기
// 카운팅정렬에 대해 공부할 것
public class P2667 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 입력할 정수의 개수

        // 배열 초기화하기
//        int[] array = new int[N];
//        for (int i = 0; i < N; i++) {
//            array[i] = scanner.nextInt();
//        }
//        scanner.close();

        /*
        버블정렬: 시간복잡도 O^2
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
         */

        /*
        Arrays.sort(): 평균 nlogn, 최악 n^2
        Arrays.sort(array);
        */

        // 카운팅정렬을 응용
        boolean[] arr = new boolean[2001];

        for (int i = 0; i < N; i++) {
            arr[scanner.nextInt() + 1000] = true;
        }

        for(int i = 0; i < 2001; i++) {
            if (arr[i]) {
                System.out.println(i - 1000);
            }
        }

//        for (int i = 0; i < N; i++) {
//            System.out.println(array[i]);
//        }
    }
}
