package 해시;

import java.util.Arrays;
import java.util.HashMap;

public class Marathon {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        System.out.println(solution.solution(part, comp));
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        /*
        // 1. 두 배열을 정렬한다.
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 2. completion를 기준으로 participant에 값을 뺀다.
        int i = 0;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                break;
            }
        }
        return participant[i];
         */

        String answer = "";
        // 1. Hash map을 만든다. participant
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        // 2. Hash map을 뺀다. completion
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }
        // 3. value가 0이 아닌 마지막 주자를 찾는다
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }
}
