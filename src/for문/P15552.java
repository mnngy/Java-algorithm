package for문;

import java.io.*;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15552
public class P15552 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] result = new int[T];

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            result[i] = A + B;
        }
        br.close();

        for (int i = 0; i < T; i++) {
            bw.write(String.valueOf(result[i]));
            bw.write("\n");
        }
        bw.close();
    }
}
