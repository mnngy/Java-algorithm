package 프로그래머스_LV1;

public class KeyPad {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        Solution solution = new Solution();
        System.out.println("" + solution.solution(numbers, hand));
    }

    private static class Solution {
        public String solution(int[] numbers, String hand) {
            StringBuilder sb = new StringBuilder();
            int leftIndex = 10; // * -> 10
            int rightIndex = 12; // # -> 12

            for (int number : numbers) {
                switch (number) {
                    case 1: case 4: case 7:
                        sb.append("L");
                        leftIndex = number;
                        break;
                    case 3: case 6: case 9:
                        sb.append("R");
                        rightIndex = number;
                        break;
                    default:
                        int leftLength = getLength(leftIndex, number);
                        int rightLength = getLength(rightIndex, number);

                        if (leftLength > rightLength) {
                            sb.append("R");
                            rightIndex = number;
                        } else if (leftLength < rightLength) {
                            sb.append("L");
                            leftIndex = number;
                        } else {
                            if (hand.equals("right")) {
                                sb.append("R");
                                rightIndex = number;

                            } else {
                                sb.append("L");
                                leftIndex = number;
                            }
                        }
                        break;
                }
            }
            return sb.toString();
        }

        /**
         *
         * @param index 손이 위치한 숫자
         * @param number 목표하는 숫자
         * @return 길이
         */
        public static int getLength(int index, int number) {
            // 0일 때, 11
            index = (index == 0) ? 11 : index;
            number = (number == 0) ? 11 : number;

            // 길이 계산하기
            int x = (index - 1) / 3;
            int y = (index - 1) % 3;
            int numberX = number / 3;
            int numberY = 1;
            return Math.abs(x - numberX) + Math.abs(y - numberY);
        }
    }
}
