package week6_20221024_20221028.day_221024.KthNum_Programmers_42748;

import java.util.PriorityQueue;

public class KthNum02 {
    private int[] arr;

    public int getKthNum(int[] command) {
        int frIdx = command[0];
        int toIdx = command[1];
        int nth = command[2];
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = frIdx-1; i < toIdx ; i++) {
            pq.add(arr[i]);         // pq에 넣기
        }

        for (int i = 0; i < nth; i++) {
            result = pq.poll();     // 앞에서부터 뽑기
        }
        return result;
    }

    public int[] solution(int[] arr, int[][] commands) {
        this.arr = arr;
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = getKthNum(commands[i]);
        }
        return answer;
    }
}
