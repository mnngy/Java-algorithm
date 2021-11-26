package 기본수학1;

import java.math.BigInteger;
import java.util.Scanner;

public class P10757 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger A = new BigInteger(scanner.next());
        BigInteger B = new BigInteger(scanner.next());

        A = A.add(B);

        System.out.println(A);
    }
}
