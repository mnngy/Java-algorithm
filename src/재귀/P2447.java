package 재귀;

import java.io.*;
import java.util.Arrays;

public class P2447 {

    static char[][] chars;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        chars = new char[N][N];
        for (int i = 0; i < chars.length; i++) {
            Arrays.fill(chars[i], ' ');
        }
        star(N, 0, 0);
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                bw.write(chars[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
    }

    public static void star(int N, int y, int x) {
        if(N == 1) chars[y][x] = '*';
        else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(i == 1 && j == 1);
                    else star(N/3, y + N/3*i, x + N/3*j);
                }
            }
        }
    }
}
