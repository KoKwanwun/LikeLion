package week6_20221024_20221028.day_221027.Programmers_42576;

import java.util.HashMap;
import java.util.Map;

class Solution {
    /*
    1. HashMap에 participant 모두 넣으면서 1로 초기화
    (단, 기존에 넣은 것이 있다면 value에 값을 불러온 후 +1)
    2. completion에 들어있는 이름을 key로 HashMap에 검색, 있으면 -1해주고 갱신
    3. memo를 한바퀴 돌면서 1인 값을 찾고 리턴
     */
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();
        for (String eachParticipant : participant) {
            memo.put(eachParticipant, memo.getOrDefault(eachParticipant, 0)+1);
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
