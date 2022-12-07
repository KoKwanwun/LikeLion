package Programmers.Programmers_42626;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int each : scoville) {
            pq.add(each);
        }

        // 예외 : K가 0이면 모든 스코빌이 가능
        if(K == 0){
            return 0;
        }

        // 계산식을 사용하기 위해 스코빌 지수가 2개는 필요하기 때문에 크기 조건식 사용
        while(true) {
            if(pq.peek() >= K) { // 가장 작은 값이 K이상이면 횟수 리턴
                return result;
            } else if(pq.size() < 2){ // 사이즈가 2보다 작으면 -1 리턴
                return -1;
            } else{
                int mixed = pq.poll() + (pq.poll() * 2);
                pq.add(mixed);
                result += 1;
            }
        }
    }
}
