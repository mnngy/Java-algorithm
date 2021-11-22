package 문자열;

import java.util.Scanner;

// https://www.acmicpc.net/problem/5622
public class P5622 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력
        String string = scanner.nextLine();
        scanner.close();

        int count = 0;

        char[] array = string.toCharArray();

        for (char a : array) {
            switch (a) {
                case 'A': case 'B': case 'C':
                    count += 3;
                    break;
                case 'D': case 'E': case 'F':
                    count += 4;
                    break;
                case 'G': case 'H': case 'I':
                    count += 5;
                    break;
                case 'J': case 'K': case 'L':
                    count += 6;
                    break;
                case 'M': case 'N': case 'O':
                    count += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    count += 8;
                    break;
                case 'T': case 'U': case 'V':
                    count += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    count += 10;
                    break;
            }
        }

        System.out.println(count);
    }
}
