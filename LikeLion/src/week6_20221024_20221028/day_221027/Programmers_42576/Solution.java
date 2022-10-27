package week6_20221024_20221028.day_221027.Programmers_42576;

import java.util.HashMap;
import java.util.Map;

class Solution {
    /*
    1. HashMap에 participant 모두 넣으면서 1로 초기화
    2. completion에 들어있는 이름을 key로 HashMap에 검색, 있으면 0으로 check
    3. memo를 한바퀴 돌면서 1인 값을 찾기
    4. participant에 남은 한명 리턴
     */
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();
        for (String eachParticipant : participant) {
            if (memo.get(eachParticipant) != null) {
                memo.put(eachParticipant, memo.get(eachParticipant)+1);
            } else {
                memo.put(eachParticipant, 1);
            }
        }

        for (String eachCompletion : completion) {
            memo.put(eachCompletion, memo.get(eachCompletion)-1);
        }
        for (String key : memo.keySet()) {
            if (memo.get(key) == 1){
                return key;
            }
        }
        return null;
    }
}
