package 프로그래머스_LV1;

import java.util.ArrayList;

public class RemoveSmallestNumber {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(new int[]{4, 3, 2, 1});
        for (int i = 0; i < result.length; i++) {
            System.out.println("result = " + result[i]);
        }
    }
}

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        ArrayList<Integer> list = new ArrayList<>();

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        while (list.contains(min)) {
            int index = list.indexOf(min);
            list.remove(index);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
