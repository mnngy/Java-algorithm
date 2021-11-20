package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 한 번더 풀어도 재밌을 거 같다

// acmicpc.net/problem/3052
// Collection Interface: List, Set, Queue + Map
// Set: 순서를 유지하지 않는 데이터의 집합, 중복을 허용하지 않는다.
// List: 순서가 있는 데이터의 집합, 중복을 허용한다.
// Queue: List 와 유사
public class P3052 {

    public static void main(String[] args) throws IOException {
        /*
        1. HashSet 을 사용하는 방법

        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        // 10개의 정수 입력
        for (int i = 0; i < 10; i++) {
            set.add(scanner.nextInt() % 42);
        }
        scanner.close();

        System.out.println(set.size());
         */

        // 2. 배열을 사용하는 방법
        boolean[] array = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            array[Integer.parseInt(br.readLine()) % 42] = true;
        }

        int count = 0;
        for (boolean value : array) {
            if (value) {
                count++;
            }
        }
        System.out.println(count);
    }
}
