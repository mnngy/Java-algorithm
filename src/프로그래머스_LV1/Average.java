package 프로그래머스_LV1;

import java.util.Arrays;

public class Average {

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMean getMean = new GetMean();
        System.out.println(getMean.getMean(x));
    }

    private static class GetMean {
        public int getMean(int[] x) {
            return (int) Arrays.stream(x).average().orElse(0);
        }
    }
}
