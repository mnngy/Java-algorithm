package 재귀;

public class HelloWorld {

    public static void main(String[] args) {
        helloWorld(5);
    }

    // HelloWorld를 반복 출력하는 재귀함수
    private static void helloWorld(int N) {
        if (N == 0) {
            return;
        }
        System.out.println("HelloWorld");
        // 재귀함수 시작
        helloWorld(N - 1);
    }
}
