package week8_20221107_20221111.day_221107.Programmers_12947;

class Solution {
    public boolean solution(int x) {
        // 정수 x를 String으로 변환 후, 각 자리수로 나누기
        String[] nums = String.valueOf(x).split("");
        int divideNum = 0;

        // 각 자리수를 다시 정수로 변환하여 더하기
        for (String num : nums) {
            divideNum += Integer.parseInt(num);
        }

        return x % divideNum == 0;
    }
}