package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/2908
public class P2908 {

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//
//        int A = scanner.nextInt();
//        int B = scanner.nextInt();
//
//        scanner.close();

        /*
            - StringBuilder 는 문자열을 다루는 클래스로 많이 쓰이고있다.
            - StringBuilder, append()
         */

//        A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
//        B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(A > B ? A : B);
    }
}
