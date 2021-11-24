package 정렬;

import java.util.*;

// 수 정렬하기 2
public class P2751 {

    public static void main(String[] args) {
        // Scanner + Collections.sort
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for (Integer value : list) {
            sb.append(value).append("\n");
        }

        System.out.println(sb);
    }
}
