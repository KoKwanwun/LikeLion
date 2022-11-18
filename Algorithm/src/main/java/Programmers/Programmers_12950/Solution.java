package Programmers.Programmers_12950;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // answer을 arr1로 초기화
        int[][] answer = arr1;

        // answer의 각 원소에 arr2 원소 더하기
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] += arr2[i][j];
            }
        }
        
        return answer;
    }
}
