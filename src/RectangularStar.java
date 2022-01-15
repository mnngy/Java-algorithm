import java.io.IOException;
import java.util.Scanner;

public class RectangularStar {

    public static void main(String[] args) throws IOException {
        // 입력
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        // 출력
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

