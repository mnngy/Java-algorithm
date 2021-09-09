package 문자열;

import java.util.Scanner;

// https://www.acmicpc.net/problem/11654
public class P11654 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        scanner.close();

        int result = str.charAt(0);

        System.out.println(result);
    }
}

/*
charAt()
Scanner를 사용해서 입력을 받을 때 char 타입으로 입력을 받을 수 없다.
String 타입으로 입력을 받아야 하는데 charAt()를 사용하면 String 으로 저장된
문자열 중에서 한 글자만 선택해서 char 타입으로 변환해준다.

문자 -> 정수: 아스키코드

아스키 코드: 컴퓨터는 문자를 기억할 수 없기 때문에, 숫자 번호에 문자를 연결하여 기억한다.
그래서 초기에 만든 숫자 - 문자 매핑 테이블을 아스키 코드라고 한다.
 */
