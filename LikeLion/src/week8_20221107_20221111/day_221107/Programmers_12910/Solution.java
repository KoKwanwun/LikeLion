package week8_20221107_20221111.day_221107.Programmers_12910;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        // arr의 숫자 중 divisor로 나눴을 때 0인 경우만 ArrayList에 넣어주기
        ArrayList<Integer> results = new ArrayList<>();
        for (int num : arr) {
            if(num % divisor == 0){
                results.add(num);
            }
        }

        // ArrayList의 값을 Array로 바꿔주고 정렬
        int[] answer = new int[results.size()];
        for (int i = 0; i < results.size(); i++) {
            answer[i] = results.get(i);
        }
        Arrays.sort(answer);

        // 나누어 떨어지는 원소가 없을 경우 리턴할 [-1] 생성
        int[] notExistAnswer = {-1};

        // 나누어 떨어지는 원소가 없을 경우, notExistAnswer 리턴
        // 있는 경우, answer 리턴
        if(answer.length == 0)
            return notExistAnswer;
        else{
            return answer;
        }
    }
}
