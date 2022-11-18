package Programmers.Programmers_12950;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 배열 크기 설정
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            // 새로운 배열 생성하여 더한 값을 넣고 answer에 하나씩 넣기
            int[] arr = new int[arr1[i].length];

            for (int j = 0; j < arr1[i].length; j++) {
                arr[j] = arr1[i][j] + arr2[i][j];
            }

            answer[i] = arr;
        }
        
        return answer;
    }
}
