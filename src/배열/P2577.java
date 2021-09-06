package 배열;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2577
public class P2577 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int value = (scanner.nextInt() * scanner.nextInt() * scanner.nextInt());
      String str = Integer.toString(value);
      scanner.close();

      for (int i = 0; i < 10; i++) {
          int count = 0;
          for (int j = 0; j < str.length(); j++) {
              if ((str.charAt(j) - '0') == i) {
                  count++;
              }
          }
          System.out.println(count);
      }

    }
}
