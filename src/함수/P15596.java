package 함수;

import java.util.Scanner;

// 2번 풀었는데, 다시 풀지 않아도 됨
// https://www.acmicpc.net/problem/15596
public class P15596 {

    public static void main(String[] args) {
//        int[] a = new int[3];
//        a[0] = 0;
//        a[1] = 1;
//        a[2] = 2;
//        System.out.println(sum(a));
    }

    private static long sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += i;
        }
        return sum;
    }
}

