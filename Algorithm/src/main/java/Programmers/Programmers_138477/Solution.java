package Programmers.Programmers_138477;

import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        // k가 score의 길이보다 클 경우 방지
        if(k > score.length){
            k = score.length;
        }

        int[] answer = new int[score.length];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // for문을 2개로 나눈 이유 : pq.size()와 k를 비교하는 if문이 매 단계에서 실행되므로 시간복잡도가 커질 수 있다고 판단
        // k의 크기까지는 pq에 그냥 넣고 각 단계마다 최소값을 answer에 넣기
        for (int i = 0; i < k; i++) {
            pq.add(score[i]);
            answer[i] = pq.peek();
        }

        // score값이 pq의 최소값보다 작다면 추가하지 않고 최소값을 answer에 넣기
        // 아니라면, pq의 최소값을 꺼낸 후, score를 새롭게 추가하고 그 중 최소값을 answer에 넣기
        for (int i = k; i < score.length; i++) {
            if(score[i] < pq.peek()) {
                answer[i] = pq.peek();
            } else{
                pq.poll();
                pq.add(score[i]);
                answer[i] = pq.peek();
            }
        }

        return answer;
    }
}
