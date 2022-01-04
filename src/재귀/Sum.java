package 재귀;

public class Sum {

    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    private static int sum(int N) {
        if (N == 0) {
            return 0;
        }
        return N + sum(N - 1);
    }
}
