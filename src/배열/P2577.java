package 배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2577 {

    static long A, B, C;
    static int[] count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());

        count = new int[10];

        String temp = String.valueOf(A*B*C);

        for (int i = 0; i < temp.length(); i++) {
            ++count[Integer.parseInt(temp.substring(i, i+1))];
        }

        for (int i : count) {
            System.out.println(i);
        }
    }
}
