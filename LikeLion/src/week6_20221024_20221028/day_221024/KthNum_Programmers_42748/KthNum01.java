package week6_20221024_20221028.day_221024.KthNum_Programmers_42748;

import java.util.Arrays;

public class KthNum01 {
    public int[] solution(int[] array, int[][] commands) {
        // commands의 길이만큼 answer 배열 생성
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] command : commands) {
            // Arrays.copyOfRange(arr, x, y) : arr의 x부터 y-1값까지 복사
            int[] sliceArr = Arrays.copyOfRange(array, command[0]-1, command[1]);
            // 배열 정렬
            Arrays.sort(sliceArr);
            // answer[idx]에 값을 넣어준 후 idx+1
            answer[idx++] = sliceArr[command[2]-1];
        }
        return answer;
    }
}
