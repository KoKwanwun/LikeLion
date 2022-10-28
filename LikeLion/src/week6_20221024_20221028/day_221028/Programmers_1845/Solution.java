package week6_20221024_20221028.day_221028.Programmers_1845;

import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int minValue = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();

        // set 기능을 통한 중복 제거
        for (int num : nums) {
            set.add(num);
        }

        // 뽑을 수 있는 N/2와 폰켓몬의 고유값 중 작은 값을 리턴
        if (set.size() < minValue){
            minValue = set.size();
        }

        return minValue ;
    }
}
