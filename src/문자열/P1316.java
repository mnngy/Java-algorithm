package 문자열;

import java.io.*;
import java.util.Arrays;

/*
    그룹 단어 체커
 */
public class P1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 단어의 개수
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (check(br.readLine()) == true) {
                count++;
            }
        }
        br.close();

        bw.write(count + "");
        bw.flush();
        bw.close();
    }

    private static boolean check(String str) {
        boolean[] check = new boolean[26];
        int prev = 0; // 앞선 문자와 연속되는지, 아닌지 판별하기 위한 변수

        // 아스키코드 a = 97

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (prev != now) {
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }
}
