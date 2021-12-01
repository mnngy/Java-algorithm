package 문자열;

import java.io.*;

/*
    크로아티아 알파벳

    BufferedReader / BufferWriter: 버퍼를 이용하기 때문에 입출력의 효율이 빠르다.
 */
public class P2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 단어 입력
        String word = br.readLine();
        br.close();

        char[] charArray = word.toCharArray();
        int count = 0;

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == 'c') {
                if (i < charArray.length - 1){
                    if (charArray[i + 1] == '=') {
                        count++; i++;
                        continue;
                    } else if (charArray[i + 1] == '-') {
                        count++; i++;
                        continue;
                    }
                }
            }

            if (charArray[i] == 'd') {
                if (i < charArray.length - 2) {
                    if (charArray[i + 1] == 'z' && charArray[i + 2] == '=') {
                        count++;
                        i += 2;
                        continue;
                    }
                }
                if (i < charArray.length - 1) {
                    if (charArray[i + 1] == '-') {
                        count++; i++;
                        continue;
                    }
                }
            }

            if (i < charArray.length - 1) {
                if (charArray[i] == 'l' && charArray[i + 1] == 'j') {
                    count++; i++;
                    continue;
                }

                if (charArray[i] == 'n' && charArray[i + 1] == 'j') {
                    count++; i++;
                    continue;
                }

                if (charArray[i] == 's' && charArray[i + 1] == '=') {
                    count++; i++;
                    continue;
                }

                if (charArray[i] == 'z' && charArray[i + 1] == '=') {
                    count++; i++;
                    continue;
                }
            }
            count++;
        }
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}
